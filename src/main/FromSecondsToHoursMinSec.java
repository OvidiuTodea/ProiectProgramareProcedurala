package main;

import java.util.Scanner;

public class FromSecondsToHoursMinSec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of seconds: ");
		long seconds = sc.nextLong();
		
		long hours = seconds / 3600 ;
		long min = (seconds - hours*3600) / 60;
		long sec = seconds - hours*3600 - min*60;
		
		System.out.println(seconds + " seconds means : " + hours + " hours "+ min +" minutes " + sec + " seconds ");

	}

}
