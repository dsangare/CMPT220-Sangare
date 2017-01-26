 /**
  * file: Lab1_2.java
  * author: Daouda Sangare
  * course: CMPT220
  * assignment: Lab 1
  * due date: Thursday January 26, 2017
  * Version: 1
  *
  * This file contains my code for question 2 of the lab
  */

import java.util.Scanner;
public class Lab1_2{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.println("enter a grade for Homework and Labs:");
  double a  = input.nextDouble();
  System.out.println("enter a grade for projects:");
  double b = input.nextDouble();
  System.out.println("enter a grade for midterms:");
  double c = input.nextDouble();
  System.out.println("enter a grade for finals:");
  double d = input.nextDouble();
  double aa = a * .40;
  double bb = b * .20;
  double cc = c * .20;
  double dd = d * .20;
  double total = (aa + bb + cc + dd);
  System.out.println(total);
  }
}
   