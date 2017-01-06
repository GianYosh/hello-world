import java.util.Scanner;

public class cmInchConv {

    public static void main(String[] args) {
        //double pi = 3.14159;
        //int x = (int) pi; //"(int)" transforms the following floating point number into an integer.
                          //Like for divisions, the fractional part is removed and always rounds toward zero.
        //System.out.println(x);
        
        //double x = (int) pi * 20.0; //the (int) takes priority over other arithmethic operations.
        //System.out.println(x);
        
        double cm;
        int inch;
        Scanner in = new Scanner(System.in);
        final double CM_PER_INCH = 2.54;
        
        System.out.print("How many cm? ");
        cm = in.nextDouble(); /*In the inch ---> cm converter this was "inch = in.nextInt();"
                               *If you leave the "nextInt" and you put a floating number as an input,
                               *it will give an error.
                               */ 
        inch = (int) (cm / CM_PER_INCH);
        System.out.printf("%f cm = %d in\n", cm, inch);
    
    }
}