import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int aux;
        int line;
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            aux = 1;
            line = i;

            for (int j = 0; j < n; j++) {
                if (i == j) {
                    arr [i][j] = 0;
                } else {
                    if (i < j) {
                        arr [i][j] = aux;
                        aux++;

                    } else {
                        arr [i][j] = line;
                        line --;
                    }
                }


            }

        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

    }
}