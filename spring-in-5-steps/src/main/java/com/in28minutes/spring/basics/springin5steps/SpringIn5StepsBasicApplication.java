package com.in28minutes.spring.basics.springin5steps;

import com.in28minutes.spring.basics.springin5steps.basic.BinarySearchImpl;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
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
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class)) {
			BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearchImpl);
			BinarySearchImpl binarySearchImpl1 = applicationContext.getBean(BinarySearchImpl.class);
			System.out.println(binarySearchImpl1);
			int[] arr = { 11, 21, 3, 17, 9, 155, 16, 19, 350 };
			int result = binarySearchImpl.binarySearch(arr, 19);
			System.out.println(result);
		}
	}

}