/*Problem4_15
  Daouda Sangare
  CMPT 220
  Lab 1
  February 23, 2016
  Version 1 */
import java.util.Scanner;

public class Problem4_15 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter a letter: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		ch = Character.toUpperCase(ch);

		
		int number = 0;
		  if(ch >= 'W') {
		    number = 9;
			System.out.println("The corresponding number is " + number);
    }		 if (ch >= 'T'){
				number = 8;
				System.out.println("The corresponding number is " + number); }
			else if (ch >= 'P'){
				number = 7;
				System.out.println("The corresponding number is " + number);}
			else if (ch >= 'M'){
				number = 6;
				System.out.println("The corresponding number is " + number);}
			else if (ch >= 'J'){
				number = 5;
				System.out.println("The corresponding number is " + number);}
			else if (ch >= 'G'){
				number = 4;
				System.out.println("The corresponding number is " + number);}
			else if (ch >= 'D'){
				number = 3;
				System.out.println("The corresponding number is " + number);}
			else if (ch >= 'A'){
				number = 2;
				System.out.println("The corresponding number is " + number);}
		   else
			System.out.println(ch + " is an invalid input"); }
	
	}
