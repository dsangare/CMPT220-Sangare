
/*Problem6_08
  Daouda Sangare
  CMPT 220
  Lab 4
  March 9th, 2016
  Version 1 */


public class Problem6_08 {
    public static void main(String[] args) {
        System.out.println("Celsius Fahrenheit | Fahrenheit Celsius");
        System.out.println("---------------------------------------");
        for (int celsius = 40, fahrenheit = 120;  celsius >= 31; celsius--, fahrenheit -= 10){
            System.out.printf("%-8.1f%-10.1f | %-11.1f%.2f%n", celsius + 0.0, 
            toFahrenheit(celsius), fahrenheit + 0.0, toCelsius(fahrenheit));
        }
    }

    
      public static double toFahrenheit(double celsius){
        return (9.0 / 5) * celsius + 32;
    }

    //Convert from Fahrenheit to Celsius
      public static double toCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);

    }
}