package com.dsa.searching;

public class LinearSearchInRange {
    public static void main(String[] args) {

        int[] nums = {22, 88, 50, 45, 39, 20,19, 37} ;
        int target = 37;

        int res5 = linearSearchInRange(nums,target,1,4);
        System.out.println("The result for search in the given range is ::: "+ res5);

    }

    //Search for target in the range of index(1,4)
    static int linearSearchInRange(int[] arr, int target, int start, int end){
        if (arr.length == 0) {
            return -1;
        }

        //Run for loop
        for( int index = start; index <= end; index++){
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
}
