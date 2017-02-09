/**
  * file: Problem4_1.java
  * author: Daouda Sangare
  * course: CMPT220
  * assignment: Lab 2
  * due date: Thursday February 9, 2017
  * Version: 1
  *
  * This file contains my code for questions for the lab
  */



import java.util.Scanner;
public class Problem4_1 {
 public static void main(String[] args) {  
   Scanner input = new Scanner(System.in);
   System.out.println("enter the length from the center to the Vertex: ");
   double length = input.nextDouble();
   double s = 2 * length * Math.sin(Math.PI / 5); 
   double area = 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5));
   System.out.println("The area of the pentagon is: " + area);
  } 
}  