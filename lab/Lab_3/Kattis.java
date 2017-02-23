/*Kattis
  Daouda Sangare
  CMPT 220
  Lab 1
  February 23, 2016
  Version 1 */


import java.util.Scanner;
  public class Kattis {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
         double sex;
	      
	      
	      while(true){   
	      double xOne = input.nextDouble();
	       
	       if (xOne == 0.0)
	         break;
	   
	      
	      double yOne = input.nextDouble();
		
		
		  double xTwo = input.nextDouble();
		
		
		  double yTwo = input.nextDouble();
		
		
		  double p = input.nextDouble();

        double godmode =  (Math.pow(Math.abs(xOne - xTwo), p) +
       Math.pow(Math.abs(yOne - yTwo), p));
       sex =  1.0/p;
       double finalGod = Math.pow(godmode,sex);
       System.out.println(finalGod);
       }
       }
       }
       
       
	   
	 	  