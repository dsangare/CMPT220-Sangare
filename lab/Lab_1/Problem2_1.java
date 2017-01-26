/**
  * file: Problem2_1.java
  * author: Daouda Sangare
  * course: CMPT220
  * assignment: lab 1
  * due date: Thursday January 26, 2017
  * Version: 1
  *
  * This file contains my code for problem 2.1 of the lab
  */







import java.util.Scanner;
public class Problem2_1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter degrees in celsius: ");
    double celsius = input.nextDouble();
    double Farenheit = (9.0 / 5) * celsius + 32;
    System.out.println( celsius + "equals" + Farenheit + "degrees Farenheit");
  }
}   
