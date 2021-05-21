package fs.apidef.identifyservice.java.java_homework6;

import java.util.Scanner;

public class MaTranVuong {
    public static void main(String[] args) {
        int n, sum = 0, tempSort;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào bậc của ma trận: ");
            n = scanner.nextInt();
        } while (n < 0);

        int[][] A = new int[n][n];
        System.out.println("Nhập vào các phần tử của ma trận A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Ma trận A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println("\n");
        }
        String printResult = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // kiểm tra nếu i == j thì mới tính tổng
                if (i == j) {
                    sum += A[i][j];
                    if (printResult.equals("")) {
                        printResult = printResult + A[i][j];
                    } else {
                        printResult = printResult + "," + A[i][j];
                    }
                }
            }
        }
        
        System.out.println("Các phần tử nằm trên đường chéo chính = " + printResult);
        System.out.println("Tổng các phần tử nằm trên đường chéo chính = " + sum);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (A[1][i] > A[1][j]) {
                    tempSort = A[1][i];
                    A[1][i] = A[1][j];
                    A[1][j] = tempSort;
                }
            }
        }
        System.out.println("\nHàng 2 của ma trận sau khi sắp xếp là: ");
        for (int i = 0; i < n; i++) {
            System.out.print(A[1][i] + "\t");
        }
    }
}
