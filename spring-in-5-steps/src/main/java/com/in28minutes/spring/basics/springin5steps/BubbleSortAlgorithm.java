package com.in28minutes.spring.basics.springin5steps;

public class BubbleSortAlgorithm {

    // TC --> O(n^2)
    // SC --> O(1)
    // No. of passes = n - 1 ; No. of comparisons in each pass = n - 1 ; Not used in
    // industry, only for educational purposes
    public int[] bubbleSort(int[] arr) {
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent array elements
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}
