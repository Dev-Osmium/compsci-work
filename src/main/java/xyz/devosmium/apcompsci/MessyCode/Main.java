package xyz.devosmium.apcompsci.MessyCode;

import java.util.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = sc.nextLine();
    System.out.println("Hello. " + name + " How old are you?");
    int age = sc.nextInt();
    // Add debugging statement
    System.out.println(age);
    // Make age check work with the legal age
    if (age >= 16)
    {
      System.out.println(name + " is old enough to drive!");
    }
    else
    {
      System.out.println(name + " needs to be older to drive.");
    }
    System.out.println("Dear " + name + ", have a great day!");
  }
}