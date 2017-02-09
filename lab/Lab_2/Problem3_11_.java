/**
  * file: Problem3_11.java
  * author: Daouda Sangare
  * course: CMPT220
  * assignment: Lab 2
  * due date: Thursday February 9, 2017
  * Version: 1
  *
  * This file contains my code for questions for the lab
  */


import java.util.Scanner;
public class Problem3_11_{
  public static void main(String[] args) {
     Scanner input =  new Scanner(System.in);
     System.out.println("Enter a year: ");
     int year = input.nextInt();
     System.out.println("Enter a month: ");
     int month = input.nextInt();
     
     switch(month){
     
     case 1:
     System.out.println( "It is " + year + " January and it has 31 days");
     break;
     
     case 2:
     System.out.println("It is " + year + " Febraury and it has 28 days");
     break;
     
     case 3:
     System.out.println("It is " + year + " March and it has 31 days");
     break;
     
     case 4:
     System.out.println("It is " + year + " April and it has 30 days");
     break;
     case 5:
     System.out.println("It is " + year + " May and it has 31 days");
     break;
     
     case 6:
     System.out.println("It is " + year + " June and it has 30 days");
     break;
     
     case 7:
     System.out.println("It is " + year + " July and it has 31 days");
     break;
     
     case 8:
     System.out.println("It is " + year + " August and it has 31 days");
     break;
     
     case 9:
     System.out.println("It is " + year + " Septemeber and it has 30 days");
     break;
     
     case 10:
     System.out.println("It is " + year + " October and it has 31 days");
     break;
     
     case 11:
     System.out.println("It is " + year + " Novemebr and it has 30 days");
     break;
     
     case 12:
     System.out.println("It is " + year + " December and it has 31 days");
     break;
     }
  }
}     
     
     