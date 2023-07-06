import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWe are deciding on the price for our standard cupcake. Here is the description:\n");

        cupcake.type();

        System.out.println("\nHow much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");

        String priceText = scanner.nextLine();
        double price = Double.parseDouble(priceText);

        cupcake.setPrice(price);

        System.out.println("\nWe are deciding on the price for our redvelvet. Here is the description:");

        redVelvet.type();

        System.out.println("\nHow much would you like to charge for the RedVelvet cupcake? (Input a numerical number taken to 2 decimal places)");

        priceText = scanner.nextLine();
        price = Double.parseDouble(priceText);

        redVelvet.setPrice(price);

        System.out.println("\nWe are deciding on the price for our chocolate cupcake. Here is the description:");

        chocolate.type();

        System.out.println("\nHow much would you like to charge for the Chocolate? (Input a numerical number taken to 2 decimal places)");

        priceText = scanner.nextLine();
        price = Double.parseDouble(priceText);

        chocolate.setPrice(price);

        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);


        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();

        Drink  water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are in the middle of creating the drink menu. We currently have two drinks on the menu but we need to decide on pricing.");

        System.out.println("\nWe are deciding on the price for our bottled water. Here is the description: \n");

        water.type();

        System.out.println("\nHow much would you like to charge for the bottled water? (Input a numerical number taken to 2 decimal places)");

        priceText = scanner.nextLine();
        price = Double.parseDouble(priceText);

        water.setPrice(price);


        System.out.println("\nWe are deciding on the price for our soda. Here is the description: \n");

        soda.type();

        System.out.println("\nHow much would you like to charge for the soda? (Input a numerical number taken to 2 decimal places)");

        priceText = scanner.nextLine();
        price = Double.parseDouble(priceText);

        soda.setPrice(price);

        System.out.println("\nWe are deciding on the price for milk. Here is the description: \n");

        milk.type();

        System.out.println("\nHow much would you like to charge for the milk? (Input a numerical number taken to 2 decimal places)");

        priceText = scanner.nextLine();
        price = Double.parseDouble(priceText);

        milk.setPrice(price);

        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);
        System.out.println(Arrays.deepToString(cupcakeMenu.toArray()));
        System.out.println(Arrays.deepToString(drinkMenu.toArray()));

        Order order = new Order(cupcakeMenu, drinkMenu);
    }
}

class Cupcake {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A basic, generic cupcake, with vanilla frosting");
    }
}

class RedVelvet extends Cupcake {
    @Override
    public void type() {
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
    }
}

class Chocolate extends Cupcake {
    @Override
    public void type() {
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
    }
}

class Drink {
    public double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void type() {
        System.out.println("A bottle of water");
    }

}

class Soda extends Drink {
    @Override
    public void type() {
        System.out.println("A bottle of soda.");
    }
}


class Milk extends Drink {
    @Override
    public void type() {
        System.out.println("A bottle of milk.");
    }
}

