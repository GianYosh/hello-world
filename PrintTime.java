//A quick exercise to use multiple methods in one class.

public class PrintTime {
    
    public static void printTime(int hour, int minute) {
        //This method is used to print the time.
        System.out.print(hour);
        System.out.print(":");
        System.out.printf("%02d", minute);
        /*without the format, the time would be printed as "23:2",
         *so I added the format specifier so that the time time now reads "23:02.
         */
    }
    
    public static void main(String[] args){
        int hour = 23;
        int minute = 02;
        printTime(hour, minute);
    }

}