/*Problem6_20
  Daouda Sangare
  CMPT 220
  Lab 4
  March 9th, 2016
  Version 1 */





import java.util.Scanner;

public class Problem6_20{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        System.out.println("The number of letters: " + countLetters(s));
    }
    
        public static int countLetters(String s) {
		int numberOfLetters = 0; 
		for (int i = 0; i < s.length(); i++) {
			
			if (Character.isLetter(s.charAt(i)))
				numberOfLetters++; 
		}
		return numberOfLetters;
	}
	}
	
