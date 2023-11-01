package com.dsa.searching;

import java.util.Arrays;

public class LinearSearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr ={
                {23, 4,1},
                {79,12,4,9},
                {49,2,19,56},
                {18,12}
        };
        int target =19;
        int[] res6 = linearSearchIn2DArray(arr, target); //Format of return value {row, col}
        System.out.println("The target element index in array is ::: "+ Arrays.toString(res6));

        int res7 = linearSearchIn2DArrayMaxElement(arr);
        System.out.println("The max element in array is ::: "+ res7);

        System.out.println("The minimum value java can hold is ::: "+ Integer.MIN_VALUE);

    }

    //Index of the target element
    static int[] linearSearchIn2DArray(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    //Maximum element in 2D Array
    static int linearSearchIn2DArrayMaxElement(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }

}
