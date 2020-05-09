package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterMl = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkMl = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeBeansGrams = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int cupsMilk = scanner.nextInt();
        int min1 = Math.min((waterMl / 200), (milkMl / 50));
        int min2 = Math.min(min1, (coffeBeansGrams / 15));
        if (min2 == cupsMilk) {
            System.out.println("Yes, I can make that amount of coffee");
        } else {
            if (min2 < cupsMilk) {
                System.out.printf("No, I can make only %d cup(s) of coffee", min2);
            } else {
                System.out.println("Yes, I can make that amount of coffee (and even "+ (min2 - cupsMilk) +" more than that)");
            }
        }

    }
}
