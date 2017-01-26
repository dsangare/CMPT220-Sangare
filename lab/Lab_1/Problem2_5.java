/**
  * file: Problem@_5.java
  * author: Daouda Sangare	
  * course: CMPT220
  * assignment: lab 1
  * due date: Thursday January 26, 2017
  * Version: 1
  *
  * This file contains my code for problem 2.5 of the lab
  */
  
  
  
import java.util.Scanner;
public class Problem2_5{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter a subtotal:");
    double subtotal = input.nextDouble();
    System.out.println("enter a gratuity rate:");
    double gratuityr = input.nextDouble();
    double gratuity = gratuityr / 100 * subtotal;
    double total = gratuity + subtotal;
    System.out.println("the gratuity is" + gratuity + ". The total is" + total);
  }
}  