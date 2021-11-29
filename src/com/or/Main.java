package com.or;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    final static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Please enter an array length: ");
        int [] arr = new int[SCANNER.nextInt()];

        System.out.println("These are the array random slots: ");

        printArr(randomArr(arr));

    }
    public static void printArr(int [] arr){

        System.out.println(Arrays.toString(arr));
    }

    public static int [] randomArr(int [] arr){
        Random r = new Random();

        for (int i = 0; i < arr.length ; i++) {
            arr[i] = r.nextInt(1000);
        }
        return arr;
    }
}
