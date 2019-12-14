package com.codewars.tasks.fundamentals.MakeNegative;

public class Main {

    public static void main(String[] args) {

        int x = -3;

        System.out.println(makeNegative(x));
    }

    public static int makeNegative(int x){
        if (x > 0){
            return x*(-1);
        }else if (x < 0){
            return x;
        }
        return 0;
    }
}
