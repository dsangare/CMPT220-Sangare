/**
  * file: Problem4_5.java
  * author: Daouda Sangare
  * course: CMPT220
  * assignment: Lab 2
  * due date: Thursday February 9, 2017
  * Version: 1
  *
  * This file contains my code for questions for the lab
  */


import java.util.Scanner;
public class Problem4_5 {
  public static void main(String[] args) {  
     Scanner input = new Scanner(System.in);
     System.out.println("enter the number of sides: ");
     int n = input.nextInt();
     System.out.println("enter the side: ");
     double s = input.nextDouble();
     double area = (n * Math.pow(s,2) / (4 * Math.tan(Math.PI / n)));
     System.out.println("The area of the polygon is: " + area);
  }
}     