package machine;
import java.util.Scanner;
public class CoffeeMachine {
    static Scanner scanner;
    static int watermlAvailable = 400;
    static int milkmlAvailable = 540;
    static int coffeBeanAvailable = 120;
    static int moneyAvailable = 550;
    static int cupsAvalible = 9;
    public static void main(String[] args) {
         scanner = new Scanner(System.in);

         print(watermlAvailable, milkmlAvailable, coffeBeanAvailable,cupsAvalible ,moneyAvailable);
         System.out.println("Write action (buy, fill, take):");
         String action = scanner.next();
         switch (action){
            case "buy" :
                buy();
                break;
            case "fill" :
                fill();
                break;
            case "take" :
                take();
                break;
             default:

         }

    }
    static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int buyop = scanner.nextInt();
        int water;
        int milk;
        int coffeBeans;
        int money;
        switch (buyop) {
            case 1 :
                water = 250;
                coffeBeans = 16;
                money = 4;
                print(watermlAvailable - water, milkmlAvailable, coffeBeanAvailable - coffeBeans,cupsAvalible - 1,moneyAvailable + money);
                break;
            case 2:
                water = 350;
                milk = 75;
                coffeBeans = 20;
                money = 7;
                print(watermlAvailable - water, milkmlAvailable - milk, coffeBeanAvailable - coffeBeans,cupsAvalible - 1,moneyAvailable + money);
                break;

            case 3 :
                water = 200;
                milk = 100;
                coffeBeans = 12;
                money = 6;
                print(watermlAvailable - water, milkmlAvailable - milk, coffeBeanAvailable - coffeBeans,cupsAvalible - 1,moneyAvailable + money);
                break;
            default:

        }
    }
    static void fill(){
        System.out.println("Write how many ml of water do you want to add:");
        int waterml = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int milkml = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int gramsCoffeBean = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cups = scanner.nextInt();
        print(watermlAvailable + waterml, milkmlAvailable + milkml, coffeBeanAvailable + gramsCoffeBean,cupsAvalible + cups,moneyAvailable);
    }
    static void take() {
        System.out.println("I gave you $" + moneyAvailable);
        print(watermlAvailable, milkmlAvailable, coffeBeanAvailable,cupsAvalible ,0);
    }
    static void print(int waterml, int milkml, int coffeBeansgrams, int cups, int money) {
        System.out.println("The coffee machine has:");
        System.out.println(waterml + " of water");
        System.out.println(milkml + " of milk");
        System.out.println(coffeBeansgrams + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");
    }
}
