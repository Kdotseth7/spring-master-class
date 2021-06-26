package com.in28minutes.spring.basics.springin5steps;

import java.util.Arrays;

public class BinarySearchImpl {

    SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    // Sort the Array
    // Search the Array
    // Return the result
    public int binarySearch(int arr[], int data) {
        int[] sortedArray = sortAlgorithm.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sortedArray));
        int low = 0;
        int high = sortedArray.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (sortedArray[mid] > data) {
                high = mid - 1;
            } else if (sortedArray[mid] < data) {
                low = mid + 1;
            } else {
                return sortedArray[mid];
            }
        }
        return -1;
    }

}