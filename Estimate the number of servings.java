package Algorithms;

import java.util.Scanner;

public class CoffeeMachine 
{
    int coffeeCount = 0;
    int posDifference = 0;
    String result = "";

    public String aCoffeeCup(int water, int milk, int coffeeBeans, int cupsOfCoffee) 
    {

        while (water >= 200 && milk >= 50 && coffeeBeans >= 15) 
        {
            coffeeCount += 1;
            water -= 200;
            milk -= 50;
            coffeeBeans -= 15;
        }
        if (cupsOfCoffee > coffeeCount) 
         {
            result = "No, I can make only " + coffeeCount + " cup(s) of coffee";
         } 
        else if (coffeeCount > cupsOfCoffee) 
          {
            posDifference = coffeeCount - cupsOfCoffee;
            result = "Yes, I can make that amount of coffee (and even " + posDifference + " more than that)";
          }
         else 
          {
            result = "Yes, I can make that amount of coffee";
          }
        return result;
    }

    public static void main(String[] args) 
    {

        CoffeeMachine coffee = new CoffeeMachine();
        try (Scanner scanner = new Scanner(System.in)) 
        {
            System.out.println("Write how many ml of water the coffee machine has: ");
            int waterQuantity = scanner.nextInt();
            System.out.println("Write how many ml of water the coffee machine has: ");
            int milkQuantity = scanner.nextInt();
            System.out.println("Write how many ml of milk the coffee machine has: ");
            int coffeeBeansQuantity = scanner.nextInt();
            System.out.println("Write how many cups of coffee you will need: ");
            int cupsOfCoffeeNeeded = scanner.nextInt();

            System.out.println(coffee.aCoffeeCup(waterQuantity, milkQuantity, coffeeBeansQuantity, cupsOfCoffeeNeeded));
        }
    }
}