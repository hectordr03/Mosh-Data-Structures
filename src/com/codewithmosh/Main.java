package com.codewithmosh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // creates new array with 3 objects
        // int[] numbers = new int[3];

        // change values in an array
        // numbers[0] = 10;
        // numbers[1] = 20;
        // numbers[2] = 30;

        // initialize and assign array at once
        // int[] numbers = {10, 20, 30};
        // System.out.println(numbers.length);
        // System.out.println(Arrays.toString(numbers));

        // Using Array class:
        Array numbers = new Array(3);
        numbers.print();
    }
}
