package com.example;

import java.util.HashSet;

public class Main {

    public static boolean checkString(String s) {
        HashSet<Character> set = new HashSet<>();
        for(char c : s.toCharArray()){
            set.add(c);
        }
        return set.size() == s.length();
    }

    public static void main(String[] args) {
        String s = "Test";
        boolean result = checkString(s);
        boolean result_tolower = checkString(s.toLowerCase()); //technically not needed as T and t are unique chars, using this in case it was needed for the assignment
        System.out.println(result);
        System.out.println(result_tolower);
    }
}
