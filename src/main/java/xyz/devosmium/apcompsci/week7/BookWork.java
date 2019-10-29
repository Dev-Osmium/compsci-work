package xyz.devosmium.apcompsci.week7;

import java.util.Scanner;

public class BookWork {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a value in pounds");
        double pounds = sc.nextDouble();
        double kg = pounds * .454;
        System.out.println(pounds + " pounds in kilograms is " + kg);
    }
}