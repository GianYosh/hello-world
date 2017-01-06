//A small test to see other uses of the modulus operator.

import java.util.Scanner;

public class Modulus {

    public static void main(String[] args) {
    
//This program check is if a number is divisible by another. If "n" = 0, then "x" is divisible by "y".
   /*int x = 25;
    *int y = 5;
    * 
    *double n;
    *n = x % y; 
    *System.out.printf("The result is %.4f", n); 
    */
    
//This program "extracts" (or print in this case) the rightmost digit(s) base if is "% 10" or "%100".
    int x = 654;
    int y = 894;
    System.out.println(x % 10);
    System.out.println(y % 100);
    }
}