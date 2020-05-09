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

         menu();


    }
    static void menu() {
        scanner = new Scanner(System.in);
        String action ;
        do{
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.next();
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
                case "remaining":
                    print(watermlAvailable, milkmlAvailable, coffeBeanAvailable,cupsAvalible ,moneyAvailable);
                    break;
                case "exit":
                    System.exit(0);
                    break;

                default:

            }

        } while (!action.equals("exit"));

    }

    static void buy(){
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String buyop = scanner.next();
        int water;
        int milk;
        int coffeBeans;
        int money;
        switch (buyop) {
            case "1" :
                water = 250;
                coffeBeans = 16;
                money = 4;
                if (watermlAvailable >= water && coffeBeanAvailable >= coffeBeans && cupsAvalible >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    watermlAvailable -= water;
                    coffeBeanAvailable -= coffeBeans;
                    moneyAvailable += money;
                    cupsAvalible--;
                } else {
                    System.out.println("I can't make a cup of coffee");
                }
                break;


            case "2" :
                water = 350;
                milk = 75;
                coffeBeans = 20;
                money = 7;
                buyCoffe(water, milk, coffeBeans, money);
                break;

            case "3" :
                water = 200;
                milk = 100;
                coffeBeans = 12;
                money = 6;
                buyCoffe(water, milk, coffeBeans, money);
                break;

            case "back" :
                menu();
                break;
            default:

        }
    }

    private static void buyCoffe(int water, int milk, int coffeBeans, int money) {
        if (watermlAvailable >= water && milkmlAvailable >= milk && coffeBeanAvailable >= coffeBeans && cupsAvalible >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            watermlAvailable -= water;
            milkmlAvailable -= milk;
            coffeBeanAvailable -= coffeBeans;
            moneyAvailable += money;
            cupsAvalible--;
        } else {
            System.out.println("I can't make a cup of coffee");
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
        watermlAvailable += waterml;
        milkmlAvailable += milkml;
        coffeBeanAvailable += gramsCoffeBean;
        cupsAvalible += cups;
    }
    static void take() {
        System.out.println("I gave you $" + moneyAvailable);
        moneyAvailable = 0;
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
