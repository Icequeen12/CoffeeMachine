package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        int water = 400;
        int milk = 540;
        int coffee = 120;
        int cups = 9;
        int money = 550;

        int[] ingredients = {water, milk, coffee, cups, money};

        String command;
        do {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Write action (buy, fill, take, remaining, exit)):");
            command = scanner.next();

            switch (command) {
                case "buy":
                    buy(scanner, ingredients);
                    break;
                case "fill":
                    fill(scanner, ingredients);
                    break;
                case "take":
                    take(ingredients);
                    break;
                case "remaining":
                    state(ingredients);

            }
        } while (!command.equals("exit"));

    }

    public static void state(int[] ingredients) {
        System.out.println("The coffee machine has:\n" +
                ingredients[0] + " of water\n" +
                ingredients[1] + " of milk\n" +
                ingredients[2] + " of coffee beans\n" +
                ingredients[3] + " of disposable cups\n" +
                "$" + ingredients[4] + " of money");
    }

    public static void buy(Scanner scanner, int[] ingredients) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        int[] espresso = {-250, 0, -16, -1, 4};
        int[] latte = {-350, -75, -20, -1, 7};
        int[] cappuccino = {-200, -100, -12, -1, 6};
        String type = scanner.next();


        switch (type) {
            case "1":
                if (enough(ingredients, espresso)) {
                    update(ingredients, espresso);
                }
                break;
            case "2":
                if (enough(ingredients, latte)) {
                    update(ingredients, latte);
                }
                break;
            case "3":
                if (enough(ingredients, cappuccino)) {
                    update(ingredients, cappuccino);
                }
                break;
        }
    }

    public static void fill(Scanner scanner, int[] ingredients) {
        System.out.println("Write how many ml of water do you want to add: ");
        ingredients[0] = ingredients[0] + scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        ingredients[1] = ingredients[1] + scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add: ");
        ingredients[2] = ingredients[2] + scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add: ");
        ingredients[3] = ingredients[3] + scanner.nextInt();
    }

    public static void take(int[] ingredients) {
        System.out.println("I gave you $" + ingredients[4]);

        ingredients[4] = 0;
    }

    public static boolean enough(int[] ingredients, int[] coffeeType) {
        String[] names = {"water", "milk", "coffee", "disposable cups"};
        for (int i = 0; i < 4; i++) {
            if (ingredients[i] < -(coffeeType[i])) {
                System.out.println("Sorry, not enough " + names[i]);
                return false;
            }
        }
        return true;
    }

    public static void update(int[] ingredients, int[] coffeeType) {

        System.out.println("I have enough resources, making you a coffee!");
        for (int i = 0; i < 5; i++) {
            ingredients[i] = ingredients[i] + coffeeType[i];
        }
    }
}