package main;

import java.util.Scanner;

public class Dobanda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dati suma :");
		double sum = sc.nextDouble();
		System.out.println("Dati nr de ani :");
		int nrAni = sc.nextInt();
		
		finalSum(sum,nrAni);
		
		
		
	}
	
	public static void finalSum(double sum, int nrAni) {
		for (int i=1; i<=nrAni; i++) {
			sum = sum + (sum/4);
		}
		System.out.println(sum);
		
	}

}
