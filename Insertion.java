package com.husseinabdikarim;

public class Insertion {

    public static void sort(Comparable[] a)
    { // Sort a[] into increasing order.
        int N = a.length;
        for (int i = 1; i < N; i++)
        { // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
            for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
                exch(a, j, j-1);
        }
    }

    public static void Descending(Comparable[] b) {

        int N = b.length;
        for (int i = 1; i < N; i++)
        { // Insert b[i] among b[i-1], b[i-2], b[i-3]... ..
            for (int j = i; j > 0 && less(b[j], b[j-1]); j--)
                exch(b, j, j-1);
        }int Num = b.length;
        for (int i = 1; i < N; i++)
        { // Insert b[i] among b[i-1], b[i-2], b[i-3]... ..
            for (int j = i; j > 0 && less(b[j-1], b[j]); j--)
                exch(b, j, j-1);
        }
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void show(Comparable[] a)
    {
        for(int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

}

