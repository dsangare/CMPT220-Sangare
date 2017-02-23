import java.util.Scanner;

public class Problem4_08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Please enter a digit between 0 and 127: ");
		int i = input.nextInt(); 
		
		System.out.println((char)i);
	}
}