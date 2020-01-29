package main;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give us a number: ");
		int nr = sc.nextInt();
		
		int factorial = 1;
		if (nr >=13) 
			System.out.println("The number is >= 13 ! Please enter a numner < 13");
		else
		{
			for (int i=1; i<=nr; i++) {
				factorial = factorial * i;
			}
			System.out.println("n! = " + factorial);
		}
		
			

	}

}
