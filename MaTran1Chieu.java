package fs.apidef.identifyservice.java.java_homework6;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class MaTran1Chieu {
    public static void main(String[] args) {
        int n, i;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            n = scanner.nextInt();
        } while (n < 0);

        // khởi tạo và cấp phát bộ nhớ cho mảng
        int array[] = new int[n];

        System.out.println("Nhập các phần tử cho mảng: ");
        for (i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Hiển thị mảng vừa nhập
        System.out.println("\nMảng ban đầu: ");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }

        PrintPrime(array, n);

        int sum = 0;
        for (i = 0; i < n; i++) {
            if (IsPrime(array[i])) {
                sum = sum + array[i];
            }
        }
        System.out.println("\nTổng các số nguyên tố trong mảng là:" + sum);

        System.out.println("Nhập vị trí thứ k: ");
        int k = scanner.nextInt();
        System.out.println("Nhập số cần sửa vào vị trí thứ k: ");
        int c = scanner.nextInt();
        if (k >= n || k < 0) {
            System.out.println("\nKhông tồn tại vị trí này trong mảng! ");
        } else {
            for (i = 0; i < n; i++) {
                if (i == k) {
                    array[i] = c;
                    break;
                }
            }
        }
        // hiển thị các phần tử trong mảng sau khi xóa k
        System.out.println("Mảng sau khi sửa phần tử thứ " + k + " là: ");
        for (i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }


    public static boolean IsPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void PrintPrime(int array[], int n) {
        String printResult = "";
        for (int i = 0; i < n; i++) {
            if (IsPrime(array[i])) {
                if (printResult.equals("")) {
                    printResult = printResult + array[i];
                } else {
                    printResult = printResult + "," + array[i];
                }
            }
        }
        System.out.println("\nCác số nguyên tố trong mảng là:" + printResult);
    }
}
