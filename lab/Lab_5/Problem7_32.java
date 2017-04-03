/*Problem7_32
  Daouda Sangare
  CMPT 220
  lab 5
  March 31, 2017
  Version 1 */

import java.util.*;
public class Problem7_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int size = input.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = input.nextInt();
        }
        partition(list);
        System.out.print("After the partition, the list is " + list);
    }

    public static int partition(int[] list) {
        int i = 0;
        for (int j = 1; j < list.length; j++) {
            if (list[j] < list[i]){
                int temp = list[j];
                System.arraycopy(list, i, list, i + 1, j - i);
                list[i] = temp;
                i++;
            }
        }
        return i;
    }

    
}