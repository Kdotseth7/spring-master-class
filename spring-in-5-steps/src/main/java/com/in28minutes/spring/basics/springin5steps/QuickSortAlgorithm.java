package com.in28minutes.spring.basics.springin5steps;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements SortAlgorithm {

    // TC --> Best Case: O(n log n), Worst Case: O(n^2)
    // SC --> Best Case: O(log n) = height of the tree, Worst Case: O(n) if there is
    // a function call for every element,i.e., n function calls in call stack
    // Link: https://www.youtube.com/watch?v=7h1s2SojIRw,
    // https://www.youtube.com/watch?v=-qOVVRIZzao
    /*
     * 1. Uses divide and conquer technique, i.e., Recursion 2. Most commonly used
     * sorting algorithm 3. To ensure worst case TC doesn't occur always use middle
     * element as pivot
     */

    @Override
    public int[] sort(int[] array, int left, int right) {
        int pivot = left;
        int partitionIndex;
        if (left < right) {
            partitionIndex = partition(array, pivot, left, right);
            // Sort Left and Right
            sort(array, left, partitionIndex);
            sort(array, partitionIndex + 1, right);
        }
        return array;
    }

    public int partition(int[] array, int pivot, int left, int right) {
        while (left < right) {
            while (array[pivot] >= array[left]) {
                left++;
            }
            while (array[pivot] < array[right]) {
                right--;
            }
            if (left < right)
                swap(array, left, right);
        }
        swap(array, pivot, right);
        return right;
    }

    public void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    };

}