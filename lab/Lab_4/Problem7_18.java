/*Problem7_18
  Daouda Sangare
  CMPT 220
  Lab 4
  March 9th, 2016
  Version 1 */



import java.util.Scanner;

public class Problem7_18 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] speed = new double[10];
	    
		for (int k = 0; k < speed.length; k++)
			speed[k] = input.nextDouble();

		for (int l = 0; l < speed.length; l++){
		  for (int k = 0; k < speed.length -1 ; k++){
		    if (speed[k] > speed[k+1])
		      swap(speed , k ,k+1);
		      
		  }      
		}
		System.out.println(speed);


      }static void swap(double[] arr, int idx1, int idx2){
        double tmp = arr[idx1];


}
}