import java.util.Scanner;

//This program converts a total number of seconds to hours, minutes, and seconds.

public class ConvertSec {
    
    public static void main(String[] args) {
        int secT, hour, min, sec, minT;
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many seconds? ");
        secT = in.nextInt();
        minT = secT / 60; //total minutes
        sec = secT % 60; //seconds remainder
        hour = minT / 60; //total hours
        min = minT % 60; //minutes remainder
        System.out.printf("%d seconds = %dhour(s), %d minute(s), %d second(s)", secT, hour, min, sec);
    }
}