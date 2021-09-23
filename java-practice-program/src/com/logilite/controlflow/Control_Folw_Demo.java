package com.logilite.controlflow;

import java.util.Scanner;

public class Control_Folw_Demo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 for Reversing Array..");
		System.out.println("Enter 2 for Counting divisors..  ");
		System.out.println("Enter 3 for Find Max Number in array.. ");

		int option = sc.nextInt();

		switch (option) {

		case 1:
			String[] iArray = { "Logilite", "is", "the", "Best", "Company" };
			System.out.print("Original String : - ");

			for (String string : iArray) {
				System.out.print(string + " ");
			}

			for (int i = 0, j = iArray.length - 1, middle = iArray.length / 2; i < middle; i++, j--) {
				String temp = iArray[i];
				iArray[i] = iArray[j];
				iArray[j] = temp;
			}
			System.out.print("\nAfter Reversing : - ");

			for (int i = 0; i < iArray.length; i++) {
				System.out.print(iArray[i] + " ");
			}

			break;

		case 2:
			System.out.println("Enter nuber For Divisor find :- ");

			int x = sc.nextInt();
			int divisorCount = 0;

			for (int i = 1; i <= x; i++) {
				if (x % i == 0) {
					System.out.print(i + " ");
					divisorCount++;
				}
			}
			System.out.println("\nDivisor Count: " + divisorCount);

			break;

		case 3:
			System.out.println("\nDisplaying Numbers ...");
			int[][] numbers = { { 100, 23, 69, 95, 28, 90 }, { 99, 10, 67, 27, 39 }, { 53, 87, 91, 25 } };

			for (int i = 0; i < numbers.length; i++) {
				System.out.print("\nDisplaying Numbers as per array " + i + ": ");
				int max = 0;

				for (int j = 0; j < numbers[i].length; j++) {

					if (numbers[i][j] > max) {
						max = numbers[i][j];
					}
					System.out.print(numbers[i][j] + " ");
				}
				System.out.println("\nmax Number : " + max);
			}

			break;

		default:
			System.out.println("Please Enter Vailid option..");
			break;
		}

	}

}
