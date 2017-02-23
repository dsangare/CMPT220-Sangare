/*Problem4_26  
  Daouda Sangare
  CMPT 220
  Lab 1
  February 23, 2016
  Version 1 */




import java.util.Scanner;
  public class Problem4_26 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter an number, for example 11.56: ");
        String number = input.nextLine();
        int dollarAmount = Integer.parseInt(number.substring(0, number.indexOf('.')));
        int amountRemain = Integer.parseInt(number.substring(number.indexOf('.') + 1));

		
		int dollars = amountRemain / 100;
		amountRemain = amountRemain % 100;
		
		int quarter = amountRemain / 25;
		amountRemain = amountRemain % 25;
		
		int dimes = amountRemain / 10;
		amountRemain = amountRemain % 10;
		
		int nickels = amountRemain / 5;
		amountRemain = amountRemain % 5;
		
		int pennies = amountRemain;
		
		System.out.println("The amount of Dollars are: " + dollarAmount
		+ "The amount of Quarters is: " + quarter + "The amount of dimes is: "
		+ dimes +"The amount of nickels: " + nickels + "The amount of pennies is: " 
		+ pennies);
		
	}}
	
		