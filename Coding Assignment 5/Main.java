import java.util.Arrays;

public class Main {


    public static int[] MatrixSearch(int[][] arr, int key){
        if(arr.length == 0){
            return new int[]{0};
        }
        int nrows = arr.length;
        int ncols = arr[0].length;

        int i = 0;
        int j = ncols - 1;

        while(i >= 0 && i < nrows && j >= 0 && j < ncols){

            if (arr[i][j] != key) {
                if(arr[i][j] < key){
                    i++;
                }
                else{
                    j--;
                }
            } else {
                return new int[]{i, j};
            }

        }
        return new int[]{0};
    }


    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(arr[1][0]); //arr[1][0] is 5
        System.out.println(Arrays.toString(MatrixSearch(arr, 5)));
    }
}
