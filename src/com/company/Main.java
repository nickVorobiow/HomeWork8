package com.company;

public class Main {

    public static void main(String[] args) {
        //задание 1
        int[] intNumbers = new int[3];
        for (int index = 0; index < intNumbers.length; index++) {
            intNumbers[index] = index + 1;
        }

        float[] floatNumbers = {1.57f, 7.654f, 9.986f};
        boolean[] boolArray = {true, true, false};

        //задание 2
        for (int index = 0; index < intNumbers.length; index++) {
            if (index != intNumbers.length - 1) {
                System.out.print(intNumbers[index] + ",");
            }
            else {
                System.out.println(intNumbers[index]);
            }
        }

        for (int index = 0; index < floatNumbers.length; index++) {
            if (index != floatNumbers.length - 1) {
                System.out.print(floatNumbers[index] + ",");
            }
            else {
                System.out.println(floatNumbers[index]);
            }
        }

        for (int index = 0; index < boolArray.length; index++) {
            if (index != boolArray.length - 1) {
                System.out.print(boolArray[index] + ",");
            }
            else {
                System.out.println(boolArray[index]);
            }
        }

        //задание 3
        System.out.println();
        for (int index = intNumbers.length - 1; index >= 0; index--) {
            if (index != 0) {
                System.out.print(intNumbers[index] + ",");
            }
            else {
                System.out.println(intNumbers[index]);
            }
        }

        for (int index = floatNumbers.length - 1; index >= 0; index--) {
            if (index != 0) {
                System.out.print(floatNumbers[index] + ",");
            }
            else {
                System.out.println(floatNumbers[index]);
            }
        }

        for (int index = boolArray.length - 1; index >= 0; index--) {
            if (index != 0) {
                System.out.print(boolArray[index] + ",");
            }
            else {
                System.out.println(boolArray[index]);
            }
        }

        //Задание 4
        System.out.println();
        oddToEven(intNumbers);
    }

    public static void oddToEven(int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] % 2 == 1) {
                ++arr[index];
            }
            if (index != arr.length - 1) {
                System.out.print(arr[index] + ",");
            }
            else {
                System.out.println(arr[index]);
            }
        }
    }

}


