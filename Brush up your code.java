package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static final Scanner scanner = new Scanner(System.in);
    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int cups = 9;
    private static int money = 550;

    public static void main(String[] args) {
        readAction();
    }

    private static void showStateMachine() {
        System.out.printf("\nThe coffee machine has:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n" +
                "%d disposable cups\n" +
                "$%d of money\n\n", water, milk, beans, cups, money);
    }

    private static void readAction() {
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        String option = scanner.nextLine();

        switch (option) {
            case "buy":
                buy();
                break;
case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                showStateMachine();
                break;
            case "exit":
                System.exit(0);
            default:
                break;
        }

        readAction();
    }

    private static void buy() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, " +
                "2 - latte, 3 - cappuccino, back - to main menu: ");
        String option = scanner.nextLine();

        switch (option) {
            case "1":
                makeCoffee(250,0, 16, 4);
                break;
            case "2":
                makeCoffee(350,75, 20, 7);
                break;
            case "3":
                makeCoffee(200,100, 12, 6);
                break;
  case "back":
            default:
                break;
        }

        System.out.println();
    }

    private static void makeCoffee(int water, int milk, int beans, int money) {
        if (CoffeeMachine.water >= water && CoffeeMachine.milk >= milk
                && CoffeeMachine.beans >= beans) 
	  {
            CoffeeMachine.water -= water;
            CoffeeMachine.milk  -= milk;
            CoffeeMachine.beans -= beans;
            CoffeeMachine.money += money;
            cups--;
        } 
        else 
        {
            System.out.println("I have enough resources, making you a coffee!");
        }
    }

    private static void fill() 
     {
        System.out.println("Write how many ml of water you want to add:");
        int addWater = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many grams of coffee beans you want to add:");
        int addBeans = Integer.parseInt(scanner.nextLine());
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addCups = Integer.parseInt(scanner.nextLine());

        water += addWater;
        milk  += addMilk;
        beans += addBeans;
        cups  += addCups;
    }

    private static void take() 
    {
        System.out.printf("I gave you $%d\n\n", money);
        money = 0;
    }
}
