package com.codewars.tasks.fundamentals.CountOfPositivesSumOfNegatives;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        Given an array of integers.

        Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.

        If the input array is empty or null, return an empty array.
        */

        int[] input = {1,2,3,4,5,6,7,8,9,10,-11,-12,-13,-14,-15};

        System.out.println(Arrays.toString(countPositivesSumNegatives(input)));
    }

    public static int[] countPositivesSumNegatives(int[] input) {

        int countPositives = 0;
        int sumNegatives = 0;

        if(input == null) {

            return new int[]{};

        }else if(input.length !=0){

            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    countPositives++;
                } else if (input[i] < 0) {
                    sumNegatives += input[i];
                }
            }
            return new int[]{countPositives, sumNegatives};
        }
        return input;
    }
}
