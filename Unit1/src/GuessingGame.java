import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public GuessingGame() {
        int counter = 0;
        boolean bool= true;
        Random rand = new Random();
        int ranNum = rand.nextInt(10);

        System.out.println("Howdy, what's your name?");
        System.out.println("(type in your name)");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(name + ", I'm thinking of a number between 1 and 100");
        System.out.println("Try to guess my number.");

        while(bool) {
            System.out.println("Your Guess?");
            int gueNum = scanner.nextInt();
            if(gueNum == ranNum) {
                counter++;
                System.out.println("Well done, "+name+"! You found my number in "+counter+" tries!");
                bool = false;
            } else if(gueNum > ranNum) {
                System.out.println("Your guess is too high, try again.");
                counter++;
            } else if (gueNum < ranNum) {
                System.out.println("Your guess is too low, try again.");
                counter++;
            }
        }
    }
}
