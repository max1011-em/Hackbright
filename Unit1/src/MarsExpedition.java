import java.util.Scanner;

public class MarsExpedition {
    public MarsExpedition() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Expedition prep program starting...");
        System.out.println("Booting up...");
        System.out.println("Ready");

        System.out.println("Hello user, What is your name?");
        String name = scanner.nextLine();
        System.out.println("Hi, " + name + " --- Welcome to the Expedition prep program.\n" +
                "Are you ready to head out into the new world?\n" +
                "Type Y or N");
        String answer = scanner.nextLine();

        if(answer.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        } else {
            System.out.println("Too bad you are team leader. You have to go.");
        }

        System.out.println("How many people do you want on your expedition team? (Input an int number)");
        int teamSize = scanner.nextInt();
        if(teamSize > 2) {
            System.out.println("That's way to many people. We can only send 2 more members");
            teamSize = 2;
        } else if (teamSize < 2) {
            System.out.println("That's not enough people. We need you and 2 more members.");
            teamSize = 2;
        } else if (teamSize == 2) {
            System.out.println("That's a perfect sized team. Good job.");
        }

        System.out.println("You are allowed to bring one snack with you. What do you bring?");
        String snack = scanner.nextLine();
        System.out.println("Nice choice, you will be bringing a " + snack + " with you");

        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Mars Rover" +
                "\nB: A Chevy Silverado" +
                "\nC: A Honda Civic");
        String vehicleChoice = scanner.nextLine();

        if (vehicleChoice.equalsIgnoreCase("A")) {
            vehicleChoice = "a Mars Rover";
        } else if (vehicleChoice.equalsIgnoreCase("B")) {
            vehicleChoice = "a Chevy Silverado";
        } else if (vehicleChoice.equalsIgnoreCase("C")) {
            vehicleChoice = "a Honda Civic";
        } else {
            vehicleChoice = "your feet";
        }

        System.out.println("Your expedition team is now ready" +
                "\nLed by " + name + " with " + teamSize + " teammates." +
                "\nTo explore the surface of Mars using " + vehicleChoice + "." +
                "\nExploration team heads out in" +
                "\n5...." +
                "\n4...." +
                "\n3...." +
                "\n2...." +
                "\n1...." +
                "\nGO GO GO!");
    }
}
