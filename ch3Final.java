/*This is the final program that summirize alle the elements learned in chapter 3.
 * 1. import java library classes
 * 2. create a Scanner
 * 3. get input from keyboard
 * 4. format output (printf)
 * 5. divide and mod integers
 */

import java.util.Scanner;

//Convert cm to inches and feet.

public class ch3Final {

public static void main(String[] args) {
    double cm;
    int feet, inches, remainder;
    final double CM_PER_INCH = 2.54;
    final int IN_PER_FOOT = 12;
    Scanner in = new Scanner(System.in);

    //prompt the user and get the value.
    System.out.println("Exactly how many cm? ");
    cm = in.nextDouble();
    
    //Convert and output the result.
    inches = (int) (cm / CM_PER_INCH);
    feet = inches / IN_PER_FOOT;
    remainder = inches % IN_PER_FOOT;
    System.out.printf("%.2f cm = %d ft, %d in\n", cm, feet, remainder);
}

}

