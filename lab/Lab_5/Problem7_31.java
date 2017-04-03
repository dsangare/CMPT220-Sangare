/*Problem7_31
  Daouda Sangare
  CMPT 220
  lab 5
  March 31, 2017
  Version 1 */

import java.util.*;
public class Problem7_31 {
  	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		
		System.out.print("Enter list1: ");
		int[] list1 = new int[input.nextInt()];
		for (int i = 0; i < list1.length; i++) {
			list1[i] = input.nextInt();
		}


		System.out.print("Enter list2: ");
		int[] list2 = new int[input.nextInt()];
		for (int i = 0; i < list2.length; i++) {
			list2[i] = input.nextInt();
		}

		
		int[] list3 = merge(list1, list2);

		
		System.out.print("The merged list is");
		for (int e: list3) {
			System.out.print(" " + e);
		}
		System.out.println();
	}
	
	 public static int[] merge(int[] list1, int[] list2) {
        int size = list1.length + list2.length;
        int[] newList = new int[size];
        int p1 = 0, p2 = 0;
        while (p1 < list1.length && p2 < list2.length) {
            
            try {if (list1[p1] < list2[p2]) {
                newList[p1 + p2] = list1[p1++];
            } else {
                newList[p1 + p2] = list2[p2++];
            }
            } catch (IndexOutOfBoundsException e){
            }
        }
        while (p1 < list1.length) newList[p1 + p2] = list1[p1++];
        while (p2 < list2.length) newList[p1 + p2] = list1[p2++];
        return newList;
    }

    public static void print(int[] list) {
        for (int aList : list) {
            System.out.print(aList + " ");
        }
    }
}