package main;

import java.util.Scanner;

public class MinOf3Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no.1 : ");
		int nr1 = sc.nextInt();
		System.out.print("Enter no.2 : ");
		int nr2 = sc.nextInt();
		System.out.print("Enter no.3 : ");
		int nr3 = sc.nextInt();

		if ((nr1 < nr2) && (nr1 < nr3)) 
				System.out.println("min is : " + nr1);
			else if ((nr2<nr1) && (nr2<nr3))
					System.out.println("min is : " + nr2);
				else 
					System.out.println("min is : " + nr3);
				
	}

}
