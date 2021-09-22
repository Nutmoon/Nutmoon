package com.logilite.array;

import java.util.Scanner;

public class Araay_2D_Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Howmany row you want : -");
		int m = sc.nextInt();

		System.out.println("Howmany column you want : -");
		int n = sc.nextInt();

		int[][] arry = new int[m][n];

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {
				System.out.print("Enter Element " + "[" + (i) + "] " + " [" + (j) + "] :-");
				arry[i][j] = sc.nextInt();
				System.out.println();
			}

		}
		System.out.println(".....Printing the Array..... ");

		for (int i = 0; i < m; i++) {
			System.out.println();
			for (int j = 0; j < n; j++) {
				System.out.print(arry[i][j] + "\t");

			}

		}
	}

}
