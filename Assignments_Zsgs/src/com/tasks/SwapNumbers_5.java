package com.tasks;

public class SwapNumbers_5 {

	public static void main(String[] args) {

		int a = 5;
		int b = 10;
		System.out.println("Before swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

		int temp = a;
		a = b;
		b = temp;

		System.out.println("\nAfter swapping:");
		System.out.println("a = " + a);
		System.out.println("b = " + b);

	}

}
