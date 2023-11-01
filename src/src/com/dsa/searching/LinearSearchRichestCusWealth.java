package com.dsa.searching;

// https://leetcode.com/problems/richest-customer-wealth/description/
public class LinearSearchRichestCusWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},
                            {3,4,1}};

        int res9 = maximumWealth(accounts);
        System.out.println("The richest customer wealth is ::: "+ res9);

    }

    static int maximumWealth(int[][] accounts) {
        //Person = Row, Account = column
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            //when you start a new column, take a new sum for that row
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }

            //Now we have sum of accounts of person
            //Check with overall answer
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}
