import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        boolean contain = false;
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        for (int value : array) {
            if (value == n) {
                contain = true;
                break;
            }
        }
        System.out.println(contain);

    }
}