/**
  * file: Problem3_4.java
  * author: Daouda Sangare
  * course: CMPT220
  * assignment: Lab 2
  * due date: Thursday February 9, 2017
  * Version: 1
  *
  * This file contains my code for questions for the lab
  */

import java.util.Random;

public class Problem3_4{
  public static void main(String[] args){
    Random Rand = new Random();
    int month = Rand.nextInt(12);
    
    if (month == 1)
    System.out.println("January");
    if (month == 2)
    System.out.println("February");
    if (month == 3)
    System.out.println("March");
    if (month == 4)
    System.out.println("April");
    if (month == 5)
    System.out.println("May");
    if (month == 6)
    System.out.println("June");
    if (month == 7)
    System.out.println("July");
    if (month == 8)
    System.out.println("August");
    if (month == 9)
    System.out.println("September");
    if (month == 10)
    System.out.println("October");
    if (month == 11)
    System.out.println("November");
    if (month == 12)
    System.out.println("December");
  }
}    