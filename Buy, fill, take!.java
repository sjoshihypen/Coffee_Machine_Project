package machine;

import java.util.Scanner;

public class CoffeeMachine 
{

    static Scanner scanner = new Scanner(System.in);

    static int moneyResource = 550;
    static int waterResource = 400;
    static int milkResource = 540;
    static int coffeeResource = 120;
    static int cupResource = 9;

    public static void main(String[] args) 
  {

        info();

        System.out.println("Write action (buy, fill, take):");

        String action = scanner.next();

        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
        }

        info();

    }

    static void info() {
        System.out.println("The coffee machine has:");
        System.out.println(waterResource + " ml of water");
        System.out.println(milkResource + " ml of milk");
        System.out.println(coffeeResource + " g of coffee beans");
        System.out.println(cupResource + " disposable cups");
        System.out.println("$" + moneyResource + " of money");
    }

    static void buy() {
 System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");

        int variant = scanner.nextInt();

        switch (variant) {
            case 1:
                waterResource -= 250;
                coffeeResource -= 16;
                moneyResource += 4;
                cupResource--;
                break;
            case 2:
                waterResource -= 350;
                milkResource -= 75;
                coffeeResource -= 20;
                moneyResource += 7;
                cupResource--;
                break;
            case 3:
                waterResource -= 200;
                milkResource -= 100;
                coffeeResource -= 12;
                moneyResource += 6;
                cupResource--;
                break;
        }

    }

    static void fill() {

        System.out.println("Write how many ml of water you want to add:");
        int water = scanner.nextInt();
        waterResource += water;

        System.out.println("Write how many ml of milk you want to add:");
        int milk = scanner.nextInt();
        milkResource += milk;

        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffee = scanner.nextInt();
        coffeeResource += coffee;

        System.out.println("Write how many disposable cups of coffee you want to add:");
        int cups = scanner.nextInt();
        cupResource += cups;

    }

    static void take() {

        System.out.println("I gave you $" + moneyResource);
        moneyResource = 0;

    }

    static void makeCoffee(int cups, int waterResource, int milkResource, int coffeeResource) {
        int temp = Math.min(waterResource / 200, milkResource / 50);
        int cupsPossible = Math.min(temp, coffeeResource / 15);
        if (cups < cupsPossible) 
         {
            System.out.println("Yes, I can make that amount of coffee (and even " + (cupsPossible - cups) + " more than that)");
         } 
        else if (cups == cupsPossible) 
         {
            System.out.println("Yes, I can make that amount of coffee");
         }  
        else 
         {
            System.out.println("No, I can make only " + cupsPossible + " cup(s) of coffee");
         }
    }

}
