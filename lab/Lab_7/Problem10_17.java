
 /* file: Problem10_17.java
  * author: Daouda Sangare
  * course: CMPT220
  * assignment: Lab 2
  * due date: May 5, 2017
  * Version: 1
  *
  * This file contains my code for questions for the lab
  */



import java.math.*;

public class Problem10_17 {
    public static void main(String[] args) {
        Double number = Math.sqrt((double)Long.MAX_VALUE);
        Long firstSquareRoot = number.longValue();
        BigInteger bigInteger = new BigInteger(firstSquareRoot.toString()).add(BigInteger.TEN);
        System.out.println(Long.MAX_VALUE);
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(bigInteger.multiply(bigInteger).toString());
            bigInteger = bigInteger.add(BigInteger.TEN);
        }
  
		
		}
}

