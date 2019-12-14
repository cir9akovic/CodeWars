package com.codewars.tasks.fundamentals.HighestandLowestStringNumber;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        String str  = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        String[] strArray = str.split(" ");
        int[] intArray = new int[strArray.length];

        for (int i=0; i<strArray.length; i++){
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        for (int i=0; i<intArray.length; i++){
            if (max < intArray[i])
                max = intArray[i];
        }
        for (int i=0; i<intArray.length; i++){
            if (min > intArray[i])
                min = intArray[i];
        }
        System.out.println(Arrays.toString(intArray));
        System.out.println(max);
        System.out.println(min);

        String strMax = String.valueOf(max);
        String strMin = String.valueOf(min);

        String returnStr = (strMax + " " + strMin);

        System.out.println(returnStr);


    }
}
