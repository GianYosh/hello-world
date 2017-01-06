import java.util.Scanner;

public class ConvertTemp {
    
    public static void main(String[] args) {
        double F, C;
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many Celsius? ");
        C = in.nextDouble();
        F = (C * (9.0 / 5.0)) + 32.0;
        System.out.printf("%.1f Celsius = %.1f Farhenheit", C, F);
    }
}