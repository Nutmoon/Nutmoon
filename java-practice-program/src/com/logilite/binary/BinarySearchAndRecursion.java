
package com.logilite.binary;

import java.io.InputStream;
import java.util.Scanner;

public class BinarySearchAndRecursion {


	public static int binarySearch(int arry[], int start, int end, int find) {
		if (start == end) {
			if (find == arry[start]) {
				return start;
			} else {
				return -1;
			}
		}

		int mid = (start + end) / 2;

		if (find == arry[mid]) {
			return mid;
		} else if (find > arry[mid]) {
			return binarySearch(arry, mid + 1, end, find);
		} else {
			return binarySearch(arry, start, mid - 1, find);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new  Scanner(System.in);
		int[] arry = { 11, 19, 24, 34, 55, 65, 71, 83, 91};
		System.out.println("Enter Number For Find In Array with help of binary sorting..");
		int num = sc.nextInt();
		int index = binarySearch(arry, 0,8, num);
		if (index == -1) {
			System.out.println("This Number is Not list.");
		} else {

			System.out.println("On index Number : " + index);
		}
	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}
}