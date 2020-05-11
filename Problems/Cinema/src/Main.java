import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();

            }
        }
        boolean found = false;
        int row = 0;
        int k = scanner.nextInt();
        int count;
        for (int i = 0; i < n; i++) {
            if (found) {
                break;
            }
            count = 0;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    count++;
                    if (count == k) {
                        row = i + 1;
                        found = true;
                        break;

                    }

                } else {
                    count = 0;
                }
            }


        }
        System.out.println(row);

    }
}