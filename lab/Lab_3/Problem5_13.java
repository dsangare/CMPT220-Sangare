/*Problem6_
  Daouda Sangare
  CMPT 220
  Lab 1
  February 23, 2016
  Version 1 */
  
import java.util.Scanner;
public class Problem5_13{
  public static void main(String[] args) {
    int n = 1;
  
    while(Math.pow(n+1 ,3) < 12000){
      n++;
   
  }System.out.println(
    "Largest integer n such that n^3 is less than 12,000: " + n);
 
 }	
} 	