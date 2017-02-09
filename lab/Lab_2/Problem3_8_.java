/**
  * file: Problem3_8.java
  * author: Daouda Sangare
  * course: CMPT220
  * assignment: Lab 2
  * due date: Thursday February 9, 2017
  * Version: 1
  *
  * This file contains my code for questions for the lab
  */



import java.util.Scanner;
public class Problem3_8_{
  public static void main(String[] args) {
   Scanner input =  new Scanner(System.in);
   
   System.out.println("enter an integer:");
   int i1 = input.nextInt();
   
   System.out.println("enter an integer:");
   int i2 = input.nextInt();
   
   System.out.println("enter an integer:");
   int i3 = input.nextInt();
   
   
    
    if (i1 > i2) {
    	int number = i1;
    	i1 = i2;
    	i2 = number
    }
    
    if (i2 > i3) {
    	int number = i2;
    	i2 = i3;
    	i3 = number;
    }
    
    if (i1 > i2) {
        int number = i1;
        i1 = i2;
        i2 = number;
    }
    
	System.out.println("The numbers are in ascending order are " + i1 + ", " + i2 + ", " + i3);
    	
    
  }
}  