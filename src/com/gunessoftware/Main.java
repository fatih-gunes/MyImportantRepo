package com.gunessoftware;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1,2,3,7,8,9};
        int sum = 7;
        System.out.println(hasPairWithSum(arr, sum));
        System.out.println(hasPairWithSum2(arr, sum));

                }

                // given an array of integers and a number "sum",
                // find whether there is a pair of numbers that their total is equal to number "sum".

                // brute force solution
                // naive solution
                private static boolean hasPairWithSum (int[] arr, int sum) {
                    for(int i = 0; i < arr.length; i++) {
                        for(int j = i+1; j < arr.length; j++) {
                            if (arr[i] + arr[j] == sum) {
                                return true;
                }
            }
        }
        return false;
    }

    // better solution
    private static boolean hasPairWithSum2 (int[] arr, int sum) {
        Map<Integer, Boolean> complementMap = new HashMap<Integer, Boolean>();

        for(int i = 0; i < arr.length; i++) {
            if (complementMap.containsKey(arr[i])) {
                return true;
            }
            complementMap.put(sum - i, true);
        }

        return false;
    }
}
