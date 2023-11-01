package com.dsa.searching;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class LinearSearchEvenDigits {
    public static void main(String[] args) {
    int[] nums = {12,345,2,6,7896};

    int res8 = findEvenDigits(nums);
        System.out.println("Number of even digit numbers in the array is ::: "+ res8);
        System.out.println("Number of Digits in a given number approach-1 ::: " + countDigits1((-6788)));
        System.out.println(evenDigits(36736767));

        System.out.println("Number of Digits in a given number shortcut ::: " +countDigits2((-67887473)));
    }

    static int findEvenDigits(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (evenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    //Function checks whether the number contains even digits or not
    private static boolean evenDigits(int num) {
        int numberOfDigits  = countDigits1(num);
//        if(numberOfDigits % 2 == 0){
//        return true;
//        }
//        return false;
        return numberOfDigits % 2 == 0;
    }

    //Approach-1 : Count the number of digits
    private static int countDigits1(int num) {
        if(num < 0){
            num = -1* num;
        }

        if(num ==0){
            return 1;
        }

        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }

    //Shortcut to find number of digits
    static int countDigits2(int num) {
        if(num < 0){
            num = -1* num;
        }

        if(num ==0){
            return 1;
        }
    return (int)(Math.log10(num)) + 1;
    }

    //Approach-2 : Convert the number 8903 into string "8903" and take the length

}
