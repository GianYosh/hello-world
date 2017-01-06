import java.util.Scanner;
import java.util.Random;

public class GuessStarter {
    public static void main(String[] args) {
        int number1, number2;
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        System.out.print("I'm thinking of a number between 1 and 100\n(including both). Can you guess what it is?\n");
        System.out.print("Type a number: ");
        number1 = in.nextInt();
        System.out.println("Your guess is: " + number1);
        number2 = random.nextInt(100) + 1;
        System.out.println("The number I was thinking of is: " + number2);
        System.out.println("You were off by: " + (number1 - number2));
    }
}