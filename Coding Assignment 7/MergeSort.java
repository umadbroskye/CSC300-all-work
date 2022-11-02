package com.example;

public class MergeSort {
    void sort(int arr[], int left, int right) {
        if(left < right) {
            int middle = left + (right - left) / 2;
            sort(arr, left, middle);
            sort(arr, middle + 1, right);
            merge(arr, left, right, middle);
        }

    }

    void merge(int[] arr, int left, int right, int middle) {
        int leftsize = middle - left + 1;
        int rightsize = right - middle;

        int l[] = new int[leftsize];
        int r[] = new int[rightsize];

        for (int i = 0; i < leftsize; ++i) {
            l[i] = arr[left + i];
        }
        for (int j = 0; j < rightsize; ++j) {
            r[j] = arr[middle + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = left;
        while (i < leftsize && j < rightsize) {
            if(l[i] <= r[j]) {
                arr[k] = l[i++];
            }
            else {
                arr[k] = r[j++];
            }
            k++;
        }
        while (i < leftsize) {
            arr[k++] = l[i++];
        }
        while (j < rightsize) {
            arr[k++] = r[j++];
        }
    }
}
