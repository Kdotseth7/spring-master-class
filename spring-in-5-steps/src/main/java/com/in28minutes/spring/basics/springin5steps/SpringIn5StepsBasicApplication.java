package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

	// Loosely coupled w/o Spring
	/*
	 * public static void main(String[] args) {
	 * SpringApplication.run(SpringIn5StepsApplication.class, args);
	 * BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
	 * BinarySearchImpl binarySearchImpl = new
	 * BinarySearchImpl(bubbleSortAlgorithm); QuickSortAlgorithm quickSortAlgorithm
	 * = new QuickSortAlgorithm(); BinarySearchImpl binarySearchImpl = new
	 * BinarySearchImpl(quickSortAlgorithm); int[] arr = { 11, 21, 3, 17, 9, 155,
	 * 16, 19, 350 }; int result = binarySearchImpl.binarySearch(arr, 19);
	 * System.out.println(result); }
	 */

	// Loosely coupled with Spring
	public static void main(String[] args) {
		// Application Context
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class,
				args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearchImpl);
		BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearchImpl1);
		int[] arr = { 11, 21, 3, 17, 9, 155, 16, 19, 350 };
		int result = binarySearchImpl.binarySearch(arr, 19);
		System.out.println(result);
		applicationContext.close();
	}

}