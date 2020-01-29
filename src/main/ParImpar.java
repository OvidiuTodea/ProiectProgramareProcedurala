package main;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int nr = sc.nextInt();
		
		if ( nr % 2 == 0)
			System.out.println("Number "+ nr + " is even");
		else
			System.out.println("Number "+ nr + " is odd");

	}

}
