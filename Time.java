//Some more exercises for Ch.2

public class Time {
    
    public static void main(String[] args){

        int hour, minute, second, elapsed, dayPart, dayTotal, remaining, percentage, elapsedStart;
        
        hour = 13;
        minute = 42;
        second = 00;
        elapsed = ((hour*60)*60) + (minute*60) + second;
        dayPart = hour*60*60;
        dayTotal = 24*60*60; //86400
        remaining = dayTotal - elapsed;
        percentage = (elapsed * 100 / dayTotal);
        elapsedStart = 780 * 60;
        
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.print(":");
        System.out.println(second);
        
        System.out.print("The number of seconds since midnight is ");
        System.out.println(elapsed);
        System.out.print("The number of seconds remaining today is ");
        System.out.println(remaining);
        System.out.print("The percentage of the day passed so far is ");
        System.out.println(elapsed * 100 / dayTotal); 
        System.out.print("The elapsed time since started is ");
        System.out.println((elapsed - elapsedStart) / 60 + " minutes");
        System.out.println(percentage);
        System.out.println(elapsed);
    }

}