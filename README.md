# Sorting-Algorithms

These three classes implement three different sorting algorithms:

1. Insertion sort in the Insertion class
2. Merge sort in the Merge class
3. Quick sort in the Quick class

All three classes have a sort method that sorts an array of Comparable objects in increasing order.

The Insertion class also has a Descending method that sorts an array in decreasing order.

The Insertion class implements the insertion sort algorithm, which iterates over the array and for each element,
inserts it into its correct position in the already sorted portion of the array. 
This is done by comparing the current element with the elements before it and swapping them if they are in the wrong order.

The Merge class implements the merge sort algorithm, which recursively divides the array into two halves, sorts them,
and then merges them back together. The merge operation combines two sorted subarrays into a single sorted array.

The Quick class implements the quick sort algorithm, which selects a pivot element, partitions the array around the pivot,
and recursively sorts the subarrays on either side of the pivot. 
The partitioning step involves moving elements that are less than the pivot to the left of it and elements that are greater than the pivot to the right of it.
