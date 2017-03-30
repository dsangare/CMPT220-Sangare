/*Project_1
  Daouda Sangare
  CMPT 220
  Project 1
  March 29, 2017
  Version 1 */


import java.util.*;
  public class Prj_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sizeA = 0;
		int sizeB = 0;
		
		System.out.println("Enter the size for the first vector array: ");
		sizeA = input.nextInt();
		
		System.out.println("Enter the size for the second vector: ");
		sizeB = input.nextInt();
		
		double[] vFirst = new double[sizeA];
		double[] vSecond = new double[sizeB];
		
		
		System.out.println("enter the first vector set");
		for(int f =0; f < sizeA; f++) {
		vFirst[f] = input.nextInt();
		}
		
		System.out.println("enter the second vector set");
		for(int f =0; f < sizeA; f++) {
		vFirst[f] = input.nextInt();
		}
		
		conVect(vFirst, vSecond);
		}
		
		 public static double[] conVect(double[] vFirst, double[] vSecond) {
        double[] vResult = new double[(vFirst.length + vSecond.length) - 1];
        for (int move = 0; move < vResult.length; move++){
          for (int shift = 0; shift < vSecond.length; shift++){
            try {
              vResult[move] = vFirst[move-shift] = vSecond[shift];
            } catch (IndexOutOfBoundsException e) {
               }
          }
        }
     
       for(int i = 0; i < vResult.length; i++) {
         System.out.print(Math.round(vResult[i])+ " ");
       }   
               

    return vResult;  
  } 
  }


		