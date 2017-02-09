/**
  * file: Lab2_2.java
  * author: Daouda Sangare
  * course: CMPT220
  * assignment: Lab 2
  * due date: Thursday February 9, 2017
  * Version: 1
  *
  * This file contains my code for questions for the lab
  */



import java.util.Scanner;
public class Lab2_2{
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
    if (total >= 95)
      System.out.println("A");
    
    else if (total >= 90)
      System.out.println("A-");
    
    else if (total >= 87)
      System.out.println("B+");
  
    else if (total >= 83)
       System.out.println("B");
  
    else if (total >= 80)
       System.out.println("B-");
  
   else if (total >= 77)
     System.out.println("C+");
   
   else if (total >= 73)
     System.out.println("C");
                  
  else if (total >= 70)
    System.out.println("C-");
  
  else if (total >= 65)
     System.out.println("D+");
  
  else if (total >= 60)
     System.out.println("D");
  
  else if (total < 60)
     System.out.println("F");             
  
  }
}
   