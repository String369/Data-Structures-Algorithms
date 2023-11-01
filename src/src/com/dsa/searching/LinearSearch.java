package com.dsa.searching;

public class LinearSearch {
    public static void main(String[] args) {

        int[] nums = {22, 88, 50, 45, 39, 20,19, 37} ;
        int target = 88;

        int res = linearSearch1(nums, target);
        System.out.println("The target element in the index ::: " + res);

        int res1 = linearSearch2(nums, target);
        System.out.println("The target element is ::: " + res1);

        boolean res2 = linearSearch3(nums, target);
        System.out.println("The target element is there in array ::: " + res2);
    }


    //Search in the array : return the index if item found otherwise if not found return -1

    static int linearSearch1(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        //Run for loop
        for( int index =0; index< arr.length; index++){
                // check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        //This line will execute if the none of the above return statements executed.
        //hence the target not found
        return -1;
    }

    //Search in the array : search the target and return the element if item found otherwise if not found return -1

    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0) {
            return -1;
        }

        //Use Enhanced for loop : Because here we are returning the element no need of index
        for(int element : arr){
            // check for element == target
            if(element == target){
                return element;
            }
        }

        //This line will execute if the none of the above return statements executed.
        //hence the target not found
        //If we return -1 , There may be -1 is element in the array
        return Integer.MAX_VALUE;
    }

    //Search in the array : search the target and return the true or false if item found otherwise if not found return -1
    static boolean linearSearch3(int[] arr, int target){
        if (arr.length == 0) {
            return false;
        }

        //Use Enhanced for loop : Because here we are returning the element no need of index
        for(int element : arr){
            // check for element == target
            if(element == target){
                return true;
            }
        }

        //This line will execute if the none of the above return statements executed.
        //hence the target not found
        return false;
    }
}
