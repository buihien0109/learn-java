import java.util.Scanner;

public class Exercise_06 {
    private static Scanner scanner = new Scanner(System.in);
    private static int[][] arr;
    private static int rows;
    private static int cols;

    private static void input() {
        System.out.println("Nhập vào số hàng (rows) : ");
        rows = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập vào số cột (cols) : ");
        cols = Integer.parseInt(scanner.nextLine());

        arr = new int[rows][cols];

        System.out.println("1. Nhập vào các phần tử của mảng");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Phần tử [%d][%d] : ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
    }

    private static void print() {
        System.out.println("2. In ra phần tử của mảng");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Phần tử [%d][%d] : %d\n", i, j, arr[i][j]);
            }
        }
    }

    private static void printMainDiagonal() {
        System.out.println("3. Liệt kê các phần tử nằm trên đường chéo chính");
        if (rows != cols) {
            System.out.println("Mảng không có đường chéo chính");
        } else {
            System.out.println("Các phần tử nằm trên đường chéo chính");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (i == j) {
                        System.out.printf("%-2d", arr[i][j]);
                    }
                }
            }
        }
    }

    public static void run() {
        input();
        print();
        printMainDiagonal();
    }
}
