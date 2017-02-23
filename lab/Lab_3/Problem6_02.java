/*Problem6_02
  Daouda Sangare
  CMPT 220
  Lab 1
  February 23, 2016
  Version 1 */

  import java.util.Scanner;
  public class Problem6_02 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		
		System.out.print("Enter a integer: ");
		int number = input.nextInt();

		System.out.println("The sum of the digits is " +
			sumDigits(number));
	}


	public static int sumDigits(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number /= 10;
		}

		return sum;
	}
}
 