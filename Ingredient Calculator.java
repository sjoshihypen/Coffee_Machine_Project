package machine;
import java.util.Scanner;

public class CoffeeMachine 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        int water = 200;
        int milk = 50;
        int coffee = 15;
        System.out.println("Write how many cups of coffee you will need:");
        int cups = s.nextInt();
        System.out.println("For " + cups + "cups of coffee you will need:");
        System.out.println(water * cups + "ml of water");
        System.out.println(milk * cups + "ml of milk");
        System.out.println(coffee * cups + "coffee beans");       
    }
}
