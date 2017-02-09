/**
  * file: Problem3_15.java
  * author: Daouda Sangare
  * course: CMPT220
  * assignment: Lab 2
  * due date: Thursday February 9, 2017
  * Version: 1
  *
  * This file contains my code for questions for the lab
  */


import java.util.Scanner;
import java.util.Random;
public class Problem3_15 {
 public static void main(String[] args) {  
   int lottery = 100 + (int)(Math.random() * (900) ); 
 
   Scanner input = new Scanner(System.in);
   System.out.print("Enter your lottery pick (three digits): "); 
   int guess = input.nextInt();

 
   int lotteryDigit1 = (lottery / 100) % 10; 
   int lotteryDigit2 = (lottery / 10) % 10; 
   int lotteryDigit3 = lottery % 10;
   
   
   
  int guessDigit1 = guess / 100 % 10;
  int guessDigit2 = guess / 10 % 10;
  int guessDigit3 = guess % 10;
  System.out.println("The lottery number is " + lottery);
  int x = 0;
 
 if (guess == lottery) {
 x = 1;
 
 } else if (guessDigit2 == lotteryDigit1 
            && guessDigit1 == lotteryDigit2 
            && guessDigit2 == lotteryDigit3 
            && guessDigit3 == lotteryDigit2 
            && guessDigit1 == lotteryDigit3
            && lotteryDigit1 == guessDigit3) {
 x = 2; 
 } else if (guessDigit1 == lotteryDigit1 
  || guessDigit1 == lotteryDigit2
  || guessDigit2 == lotteryDigit1
  || guessDigit2 == lotteryDigit2
  || guessDigit1 == lotteryDigit3
  || guessDigit2 == lotteryDigit3
  || guessDigit3 == lotteryDigit3
  || guessDigit3 == lotteryDigit1
  || guessDigit3 == lotteryDigit2) {
 x = 3;
 }else{
 x = 4;
 } 
 
 
 switch(x){
 
 case 1: 
 System.out.println("Exact match: you win $10,000"); 
 break;
 case 2:
 System.out.println("Match all digits: you win $3,000"); 
 break;
 case 3:
 System.out.println("Match one digit: you win $1,000");
 break;
 case 4:
 System.out.println("Sorry, no match");
 break;
 }
 
 
 
 
 } 
}
