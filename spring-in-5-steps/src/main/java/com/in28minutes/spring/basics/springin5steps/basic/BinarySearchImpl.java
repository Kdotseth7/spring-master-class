package com.in28minutes.spring.basics.springin5steps.basic;

import java.util.Arrays;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    // @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    // Constructor Injection
    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    // Setter Injection
    // public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
    // this.sortAlgorithm = sortAlgorithm;
    // }

    // Sort the Array
    // Search the Array
    // Return the result
    public int binarySearch(int arr[], int data) {
        int[] sortedArray = sortAlgorithm.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(sortedArray));
        System.out.println(sortAlgorithm);
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

    @PostConstruct
    public void postConstruct() {
        logger.info("postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("preDestroy");
    }

}