/**
  * file:  Problem2_6.java 
  * author: Daouda Sangare
  * course: CMPT220
  * assignment: lab 1
  * due date: Thursday January 26, 2017
  * Version: 1
  *
  * This file contains my code for problem 2.6 of the lab
  */
  
  
  
  
import java.util.Scanner;
public class Problem2_6{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter a number between 0 and 1000");
    int digit = input.nextInt();
    int a = digit % 10;
    int b = (digit / 10) % 10;
    int c = (digit / 100) % 10;    
    int total = a + b + c;
    System.out.println(total);
   }
}