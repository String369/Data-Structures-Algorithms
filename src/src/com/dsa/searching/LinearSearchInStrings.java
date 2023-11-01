package com.dsa.searching;

import java.util.Arrays;

public class LinearSearchInStrings {
    public static void main(String[] args) {
        String name = "Bindu Thotakura";
        char target = 'z';

        boolean res3 =  linearSearchInStrings(name, target);
        System.out.println("The character is in the given String or not  ::: "+ res3);
//        System.out.println(linearSearchInStrings(name, target));

        boolean res4 =  linearSearchInStrings1(name, target);
        System.out.println("The character is in the given String or not ::: "+ res4);

        //It will create character array
        System.out.println(Arrays.toString(name.toCharArray()));


    }

    //Search character in a string
    static boolean linearSearchInStrings(String str, char target){
        //Here it is calling the function length()
        if(str.length() == 0){
            return false;
        }

        for(int i = 0; i< str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    //Search character in a string
    static boolean linearSearchInStrings1(String str, char target){
        //Here it is calling the function length()
        if(str.length() == 0){
            return false;
        }

        //To use for each loop you need array or collection that is why we converted string into toCharArray
        for(char ch : str.toCharArray()){
            if(target == ch){
                return true;
            }
        }
        return false;
    }
}
