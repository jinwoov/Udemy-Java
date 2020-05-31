package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE; // Integer is wrapper class
        int myMaxIntValue = Integer.MAX_VALUE;
//        System.out.println("Integer minimum value = " + myMinIntValue);
//        System.out.println("Integer maximum value = " + myMaxIntValue);
//        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));//Overflow
//        System.out.println("Busted min Value = " + (myMinIntValue - 1));//Underflow

        byte num = 69;
        short shortNum = 100;
        int intNum = 140;
        long longNum = (50000 + 10L) * (num + shortNum + intNum);
        // float takes less memory and double takes more memory
        System.out.print(longNum);



    }
}
