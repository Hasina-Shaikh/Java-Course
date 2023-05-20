package com.org.cornerstone;

import java.util.Scanner;

public class MaxValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first Value: ");
		int n1 = sc.nextInt();
		System.out.println("Enter a second Value: ");
		int n2 = sc.nextInt();
		if (n1 > n2) {
			System.out.println(n1 + " is greater than " + n2);
		} else {
			System.out.println(n1 + " is less than " + n2); 
		}
	}

}
