package com.dsa.searching;

public class LinearSearchMinNum {
    public static void main(String[] args) {
        int[] nums = {22, 88, 50, 45, 39, -8, 20,19, 37} ;

        int res6 = linearSearchMinNum(nums);
        System.out.println("The minimum value in the array is ::: "+res6);
    }

    //Find minimum element in the array
    //Assume arr.length != 0
    static int linearSearchMinNum(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;

    }
}
