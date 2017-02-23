/*Problem5_07
  Daouda Sangare
  CMPT 220
  Lab 1
  February 23, 2016
  Version 1 */
  
  
import java.util.Scanner;
public class Problem5_07{
  public static void main(String[] args) {
  double ten;
  double four = 10000;
  double  now = 10000;
  double  increase = 0.05;
 for (int year = 0; year < 14; year++){
 
   if (year <= 9)
    now += now * increase; 
   if (year <= 13)
    four += now * increase;
  }
  System.out.println("The projected in 10 years is: " + now); 
  
  System.out.println("The projected in 14 years is: " + four);  
 
 
 
 
 
 
 
 
 
 
 
 
  }
}  