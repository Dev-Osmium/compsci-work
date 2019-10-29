package xyz.devosmium.apcompsci.consoleinput;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the radius");
		float a = sc.nextFloat();
		float answer = (float) (Math.PI * Math.pow(a, 2));

		System.out.println("The area for a circle with a radius of " + a + " is " + answer);
	}
}
