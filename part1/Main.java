package com.husseinabdikarim;
//-----------------------------------------------------
// Title: Q1 - Main.java
// Author: Hussein Abdikarim Hussein
// Description: This Class uses sorting algorithms to
// sort an array of int and double which it reads as txt

//-----------------------------------------------------
import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String text = "C:\\Users\\Hussein Abdikarim\\OneDrive\\Documents\\neededFiles\\neededFiles\\integers.txt";
        String text2 = "C:\\Users\\Hussein Abdikarim\\OneDrive\\Documents\\neededFiles\\neededFiles\\doubles.txt";


//***************************** STEP 1 *************************************
        int[] numbers = readFilesForInt(text);
        int n = numbers.length;
        Integer[] arr = new Integer[n];
        for(int i=0; i < n; i++) {
            arr[i] = numbers[i];
        }

        System.out.println("Integers are reading from the integers.txt file, the array is:");
        printArray(arr);
        System.out.println("The array has been sorted in increasing order by using the insertion sort algorithm:");
        Insertion.sort(arr);
        printArray(arr);
        System.out.println("Step 1 has been completed.");
//***************************** STEP 2 *************************************
        System.out.println("The array of integers that has been sorted in decreasing order by using the insertion sort algorithm:");
        Insertion.Descending(arr);
        printArray(arr);
        System.out.println("Step 2 has been completed.");

//***************************** STEP 3 *************************************
        double[] nums = readFilesForDouble(text2);
        int count = nums.length;
        Double[] arr2 = new Double[count];

        for(int i=0; i < count; i++)
        {
            arr2[i] = nums[i];
        }

        System.out.println("Doubles are reading from the doubles.txt file, the array is:");
        printArrayForDouble(arr2);
        System.out.println("The array of double values has been sorted in increasing order by using the insertion sort algorithm:");
        Insertion.sort(arr2);
        printArrayForDouble(arr2);
        System.out.println("Step 3 has been completed.");

//***************************** STEP 4 *************************************
        Integer[] mergeArray = new Integer[n];
        for(int i=0; i < n; i++) {
            mergeArray[i] = numbers[i];
        }

        System.out.println("The original array is:");
        printArray(mergeArray);
        System.out.println("The array of integer values has been sorted in descending order by using the merge sort algorithm is:");
        Merge.sort(mergeArray);
        printArray(mergeArray);
        System.out.println("Step 4 has been completed.");

//***************************** STEP 6 *************************************
        Route[] route = {new Route("Ankara", "Antalya"),
        new Route("Ankara", "Istanbul"),
        new Route("Istanbul", "Antalya"),
        new Route("Antalya", "Izmir"),
        new Route("Izmir", "Antalya"),
        new Route("Izmir", "Ankara"),
        new Route("Antalya", "Ankara"),
        new Route("Ankara", "Izmir"),
        new Route("Istanbul", "Izmir"),
        new Route("Istanbul", "Ankara")};

        Quick.sort(route);
        printArrayForRoute(route);
        System.out.println("Step 6 has been completed.");

    }

    private static int[] readFilesForInt(String file) {
        //--------------------------------------------------------
        // Summary: this method takes a file as an input
        // and reads the file into a Scanner and returns
        // an int array.
        // Precondition: requires a String input
        // Postcondition: returns an int from the txt file.
        // --------------------------------------------------------
        try {
            File f = new File(file);
            Scanner s = new Scanner(f);
            int n = 0;

            while(s.hasNextInt())
            {
                n++; // increment n because we want to find the length of this txt file
                s.nextInt();
            }
            int S[] = new int[n];

            Scanner s1 = new Scanner(f);

            for(int i =0; i < S.length; i++)
                S[i] = s1.nextInt(); // read the integers to an int array

            return S;

        }
        catch(Exception e) {
            return null;
        }
    }

    private static double[] readFilesForDouble(String file) {
        //--------------------------------------------------------
        // Summary: this method takes a file as an input
        // and reads the file into a Scanner and returns
        // a double array.
        // Precondition: requires a String input
        // Postcondition: returns a double from the txt file.
        // --------------------------------------------------------
        try {
            File f = new File(file);
            Scanner s = new Scanner(f);
            int n = 0;

            while(s.hasNextDouble())
            {
                n++;
                s.nextDouble();
            }
            double S[] = new double[n];

            Scanner s1 = new Scanner(f);

            for(int i =0; i < S.length; i++)
                S[i] = s1.nextDouble(); // read the doubles to a double array.

            return S;

        }
        catch(Exception e) {
            return null;
        }
    }

    public static void printArray(Integer[] arr) {
        //--------------------------------------------------------
        // Summary: this method takes an Integer array as
        // input and prints that array using for loop.
        // Precondition: requires an Integer array as input.
        // Postcondition: returns the printed Integer array.
        // --------------------------------------------------------

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void printArrayForDouble(Double[] arr) {
        //--------------------------------------------------------
        // Summary: this method takes a Double array as
        // input and prints that array using for loop.
        // Precondition: requires a Double array as input.
        // Postcondition: returns the printed Double array.
        // --------------------------------------------------------

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void printArrayForRoute(Route[] arr) {
        //--------------------------------------------------------
        // Summary: this method takes a Route array as
        // input and prints that array using for loop.
        // Precondition: requires a Route array as input.
        // Postcondition: returns the printed Route array.
        // --------------------------------------------------------

        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + "");
        System.out.println();
    }

}
