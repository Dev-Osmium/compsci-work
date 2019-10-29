package xyz.devosmium.apcompsci.spherecalculator;

import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		final double piToTheOneThird = 1.464591887561523263020142527263790391738596855627937174357;
		System.out.println("Welcome to Owen Salter's Sphere App");
		System.out.println("Please enter the volume of the sphere (in cubic meters)");
		System.out.println(piToTheOneThird);
		double volume = sc.nextDouble();
		double surfArea = piToTheOneThird * Math.pow(6 * volume, 0.666666666667);
		double radius = Math.pow((3 * volume) / (4 * Math.PI), 0.666666666667);
		System.out.println(
				"The surface area of a sphere with a volume of " + volume + " is " + surfArea + " square meters.");
		System.out.println("The radius of that same sphere is " + radius);
	}
}