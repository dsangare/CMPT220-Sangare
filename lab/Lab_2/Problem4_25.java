/*Problem4_25
  Daouda Sangare
  CMPT 220
  Lab 1
  February 23, 2016
  Version 1 */




public class Problem4_25 {
	public static void main(String[] args) {
		// Generate three random uppercase letters
		int letterA = (int)(Math.random() *26 + 65);
		int letterB = (int)(Math.random() *26 + 65);
		int letterC = (int)(Math.random() *26 + 65);	

		// Generate four random digits
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		int number3 = (int)(Math.random() * 10);
		int number4 = (int)(Math.random() * 10);

		// Display number plate
		System.out.println("The Plate number is: " + (char)(letterA) + 
		((char)(letterB)) + ((char)(letterC)) + 
		number1 + number2 + number3 + number4);
	}
}