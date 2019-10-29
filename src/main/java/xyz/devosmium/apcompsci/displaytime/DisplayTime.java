package xyz.devosmium.apcompsci.displaytime;

import java.util.Scanner;

public class DisplayTime {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter a number of seconds");
		int seconds = sc.nextInt();

		// Find seconds in minutes
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");
	}
}