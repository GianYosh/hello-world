import java.util.Scanner;

public class inchCmConv {

    public static void main(String[] args) {
    int inch;
    double cm;
    Scanner in = new Scanner(System.in);
    //double cmPerInch = 2.54;
    //or
    final double CM_PER_INCH = 2.54;
    
        System.out.print("How many inches? ");
        inch = in.nextInt();
        
        cm = inch * CM_PER_INCH;
        System.out.print(inch + "in = ");
        System.out.print(cm + " cm");
    }
}