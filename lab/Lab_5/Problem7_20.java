/*Problem7_20
  Daouda Sangare
  CMPT 220
  lab 5
  March 31, 2017
  Version 1 */

import java.util.*;

public class Problem7_20 {
    public static void main(String[] args) {
         int size = 10;
        double[] list = new double[size];
        Scanner input = new Scanner(System.in);
        System.out.print("Enter " + size + " numbers: ");
        for (int i = 0; i < size; i++) {
            list[i] = input .nextDouble();
        }
        selectionSort(list);
        System.out.println(Arrays.toString(list));
    }
    public static void selectionSort(double[] list) {
		for (int i = list.length - 1; i >= 0; i--) {
			
			double currentMax = list[i];
			int currentMaxIndex = i;

			for (int j = i - 1; j >= 0; j--) {
				if (currentMax < list[j]) {
					currentMax = list[j];
					currentMaxIndex = j;
				}
			}

		
			if (currentMaxIndex != i) {
				list[currentMaxIndex] = list[i];
				list[i] = currentMax;
			}
		}
	}
}