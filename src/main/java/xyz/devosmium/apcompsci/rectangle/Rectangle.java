package xyz.devosmium.apcompsci.rectangle;

import java.util.Scanner;

public class Rectangle {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Owen Salter's Rectangle App");
		System.out.println("Please enter the height of the rectangle:");
		double height = sc.nextDouble();
		System.out.println("Please enter the length of the rectangle:");
		double length = sc.nextDouble();
		System.out.println("For your rectangle " + height + "x" + length + ":");
		System.out.println("The area is " + height * length);
		System.out.println("And the perimeter is " + 2 * (height + length));
	}
}