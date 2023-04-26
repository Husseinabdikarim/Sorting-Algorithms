package com.husseinabdikarim;

//-----------------------------------------------------
// Title: Q2 - Method.java
// Author: Hussein Abdikarim Hussein
// Description: This Class takes an array and a sort algorithm
// to do the absolute pairwise difference.
//-----------------------------------------------------

import java.util.Arrays;
import java.util.Scanner;

public class Method {

    public static void Method(String sortType, Integer[] array) {
        //--------------------------------------------------------
        // Summary: takes 2 inputs as parameters and calls sortCheck method.
        // Precondition: requires a string and an Integer array.
        // Postcondition: It invokes the sortCheck method.
        // --------------------------------------------------------

        sortCheck(sortType, array);
    }

    private static void sortCheck(String input, Integer[] array) {
        //--------------------------------------------------------
        // Summary: Compares different sorting algorithms and
        // based on that, sorts the array and calls
        // the pairwiseDifference method.
        // Precondition: requires a string and an Integer array.
        // Postcondition: It compares the string input with
        // the below if statements and invokes the pairwiseDifference.
        // --------------------------------------------------------
        if (input.equalsIgnoreCase("Selection")) {
            Selection.sort(array);
            pairwiseDifference(array);
        } else if (input.equalsIgnoreCase("Quick")) {
            Quick.sort(array);
            pairwiseDifference(array);
        } else if (input.equalsIgnoreCase("MERGE")) {
            Merge.sort(array);
            pairwiseDifference(array);
        } else if (input.equalsIgnoreCase("insertion")) {
            Insertion.sort(array);
            pairwiseDifference(array);
        } else
            System.out.println("Enter a valid sorting algorithm");
    }

    public static void pairwiseDifference(Integer[] arr) {
        //--------------------------------------------------------
        // Summary: It finds the absolute pairwise difference
        // of the values by comparing the given array and
        // prints the minimum difference.
        // Precondition: requires an Integer array as input.
        // Postcondition: prints the absolute difference between 2 numbers.
        // --------------------------------------------------------
        // 1, 4, 23, 34, 99, 102
        int n = arr.length;
        int[] pairedDifference = new int[2];
        /**
         * Integer.MAX_VALUE is used since it is the highest
         * possible int value. The 1st iteration will always
         * be less than this value and then this variable
         * is changed by the calc within the loop.
         */
        int difference = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {

            if (Math.abs(arr[i] - arr[i - 1]) < difference) {
                difference = Math.abs(arr[i] - arr[i - 1]);
                pairedDifference[0] = arr[i];
                pairedDifference[1] = arr[i - 1];
            }
            difference = Math.abs(difference);
        }

        System.out.format("%d [%d %d] \n", difference, pairedDifference[1], pairedDifference[0]);
    }
 }


