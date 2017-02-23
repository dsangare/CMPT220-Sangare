/*Problem6_03
  Daouda Sangare
  CMPT 220
  Lab 1
  February 23, 2016
  Version 1 */
import java.util.Scanner;
  public class Problem6_03 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter a integer: ");
		int number = input.nextInt();
		 
		if (isPalidrome(number))
		  System.out.println(number + " is a palindrome");
		else 
		  System.out.println(number + " is not a palindrome");
		}
		
     public static int isBackwards(int bNumber){
     
     int backwards = 0;
     int integer;
     
     while (bNumber != 0) {
       integer = bNumber % 10;
       backwards = backwards * 10 + integer;
       bNumber = bNumber /10;
       } 
       return backwards;
       }
       
    public static boolean isPalidrome(int bNumber){
    return bNumber == isBackwards(bNumber);
    }
  }

    
    
       