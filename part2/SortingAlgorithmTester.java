package com.husseinabdikarim;

//-----------------------------------------------------
// Title: Q2 - SortingAlgorithmTester
// Author: Hussein Abdikarim Hussein
// ID: 99230997266
// Section: 5
// Assignment: 2
// Description: This Class gets different input sizes,sort algorithms
// and arrays to observe how these sort algorithms and their behavior.
//-----------------------------------------------------

import java.util.Random;
import java.util.Scanner;

public class SortingAlgorithmTester {

    public static Long[] times = new Long[3];
    public static void main(String[] args) {
        //--------------------------------------------------------
        // Summary: This method gets different input sizes and sort
        // algorithms in their random,ascending and descending form to see
        // their behavior and time outputs.
        // Precondition: it does not take an input
        // Postcondition: runs for different input sizes, sort algorithms
        // with random,ascending and descending arrays
        // --------------------------------------------------------

        Scanner scan = new Scanner(System.in);

        Integer[] inputSizes = {250,1000,16000};
        String[] sortAlgorithms = {"Selection","Insertion","Merge","Quick"};
        String[] arrayTypes = {"Random", "Ascending","Descending"};


        System.out.println("Enter a seed to create random generated values :");
        int input = scan.nextInt();
        System.out.println("Seed : " + input);
        int Seed = input;
        Random random = new Random(Seed);

        // The 1st part of the loop is responsible for the inputSizes
        // after that, a random array is generated with Seed = 11
        // The 2nd loop takes the sortAlgorithms and finally, the
        // 3rd loop deals with the different arrays and calculates
        // the program accordingly e.g if the array is Descending,
        // the array has to be reversed before moving To Method.java
        for(int i = 0; i < inputSizes.length; i++) {
            System.out.println("Input size: "+ inputSizes[i]);


            Integer[] arr = new Integer[inputSizes[i]];
            for (int Rn = 0; Rn < arr.length; Rn++) {
                arr[Rn] = random.nextInt(); // storing random integers in an array
            }

            for(int j = 0; j < sortAlgorithms.length; j++) {
                System.out.print("Sort option: ");
                System.out.println(sortAlgorithms[j]);

                for(int k = 0; k < 3; k++) {
                    System.out.println(arrayTypes[k]);

                    if(arrayTypes[k].equals("random"))
                        continue;
                    else if(arrayTypes.equals("Ascending"))
                        Quick.sort(arr);
                    else{
                        reverse(arr, arr.length);
                    }

                    // this loop executes Method.Method()
                    // 3 times and takes the times of that
                    // and prints the average time.
                    for(int r = 0; r < 3; r++) {
                        Long t1 = System.currentTimeMillis();
                        Method.Method(sortAlgorithms[j],arr);
                        Long t2 = System.currentTimeMillis();
                        times[r] = t2 - t1;
                    }
                    Insertion.sort(times);
                    System.out.println("Time: " + times[1]);
                }
            }

        }
    }

    public static void reverse(Integer a[], int n) {

        //--------------------------------------------------------
        // Summary: prints the array in reverse order.
        // Precondition: requires an Integer array and the
        // length of this array.
        // Postcondition: gives the array in reverse form.
        // --------------------------------------------------------

        Integer[] b = new Integer[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            b[j - 1] = a[i];         // saving the last index of reversedArray
            j = j - 1;               // to the 1st of arr
        }
    }


}


