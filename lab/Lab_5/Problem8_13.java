/*Problem8_13
  Daouda Sangare
  CMPT 220
  Lab 5
  March 31, 2017
  Version 1 */
import java.util.*;
public class Problem8_13 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter the number of rows and columns you want in the  array: ");
		int row = input.nextInt();
		int column = input.nextInt();

		double[][] array = new double[row][column];

		System.out.println("Enter the array:");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}

		
		int[] location = biggest(array);

	
		System.out.println("The location of the largest element is at (" +
			location[0] + ", " + location[1] + ")");
	}
	 public static int[] biggest(double[][] a) {
        int[] indices = new int[2];
        double max = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];
                    indices[0] = i;
                    indices[1] = j;
                }
            }
        }
        return indices;
    }
}