package com.in28minutes.spring.basics.springin5steps;

public class BubbleSortAlgorithm implements SortAlgorithm {

    // TC --> O(n^2)
    // SC --> O(1)
    // No. of passes = n - 1 ; No. of comparisons in each pass = n - 1 ; Not used in
    // industry, only for educational purposes

    @Override
    public int[] sort(int[] array, int left, int right) {
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength - 1; i++) {
            for (int j = 0; j < arrayLength - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap adjacent array elements
                    swap(array, j, j + 1);
                }
            }
        }
        return array;
    }

    public void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}