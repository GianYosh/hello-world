public class Date {
    
    public static void main(String[] args){
        String day, month;
        int date, year;
        
        day = "Sunday";
        month = "December";
        date = 25;
        year = 2016;
        
        
        System.out.println("American format:");
        System.out.print(day);
        System.out.print(", ");
        System.out.print(month);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(", ");
        System.out.println(year);
        System.out.println("European format:");
        System.out.print(day);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(month);
        System.out.print(" ");
        System.out.println(year);
    }

}