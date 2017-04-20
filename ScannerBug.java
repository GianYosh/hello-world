//This program is to show the infamus Scanner Bug.

import java.util.Scanner;

public class ScannerBug {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner in = new Scanner(System.in);
        System.out.print("How old are you? ");
        age = in.nextInt();
        in.nextLine(); //This read next line and fixes the Scanner Bug.
        System.out.print("What's your name? ");
        name = in.nextLine();
        //System.out.print("How old are you? ");
        //age = in.nextInt();
        System.out.printf("Hello %s, age %d\n", name, age);
    }
}