/*Problem5_1
  Daouda Sangare
  CMPT 220
  Lab 1
  February 23, 2016
  Version 1 */


import java.util.Scanner;
public class Problem5_1{
  public static void main(String[] args) {
    double neg = 0;
    double pos = 0;
    double amount = 0;
    double total = 0;
    double number;
    Scanner input = new Scanner(System.in);
    do{
    System.out.println("Enter an integer, the input ends if it is 0: "); 
    number = input.nextInt();
           	
   if(number > 0)
     pos ++;
   else if(number < 0)
     neg++;
     
  if(number != 0)
     amount++;
     total += number;
   } 
    while(number!= 0);
    
     double avg = total / amount;
    System.out.println(
            "The number of positive is " + pos+
            "\nThe number of negatives is " + neg +
            "\nThe total is total " + total +
            "\nThe average is " + avg);
    }
 }   