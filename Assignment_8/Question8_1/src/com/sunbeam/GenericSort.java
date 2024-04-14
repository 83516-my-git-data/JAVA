//Q1. Write a generic sort method for implementing selection sort algorithm with given comparator
//Object as parameter. Below is reference code for selection sort do the respective changes to make it
//generic using comparator
////Q1. Write a generic sort method for implementing selection sort algorithm with given comparator
//Object as parameter. Below is reference code for selection sort do the respective changes to make it
//generic using comparator
//static void selectionSort(Integer [] arr) {
//for(int i=0; i<arr.length-1; i++)
//for(int j=i+1; j<arr.length; j++)
//if(arr[i] > arr[j]) {
//Integer temp = arr[i];
//arr[i] = arr[j];
//arr[j] = temp;
//}
//}

package com.sunbeam;

import java.util.Comparator;

public class GenericSort {
	 static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = i + 1; j < arr.length; j++)
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
	}

	public static void main(String[] args) {

		class Solution implements Comparator<Integer> {
			@Override
			public int compare(Integer o1, Integer o2) {
				int value = Integer.compare(o1, o2);
				return value;
			}
		}

		Integer[] arr= {10, 55, 65,2,82};
		
		Solution s = new Solution();
		
		System.out.println("before sort :");
		for (Integer integer : arr) {
			System.out.print(integer);
		}
		
		selectionSort(arr, s);
		
		System.out.println("after sort :");
		for (Integer integer : arr) {
			System.out.print(integer);
		}
	}

}
