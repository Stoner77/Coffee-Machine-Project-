import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> arl = new ArrayList<>();
        int maxAscLenght = 1;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        if (array.length == 1) {
            System.out.println(1);
        } else {
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    maxAscLenght++;
                    if (i == array.length - 1) {
                        arl.add(maxAscLenght);
                    }

                } else {
                   arl.add(maxAscLenght);
                   maxAscLenght = 1;

                }

            }
            System.out.println(Collections.max(arl));
        }


    }
}