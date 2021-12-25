public class Exercise_01 {
    // In ra hình vuông
    private static void printSquare(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // In ra hình tam giác
    private static void printTriangle(int side) {
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if (j <= i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    // In ra hình tam giác
    private static void printTriangle02(int side) {
        for (int i = 0; i < side; i++) {
            System.out.print(" ".repeat(side - i - 1));
            for (int j = 0; j < side; j++) {
                if (j <= i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void run() {
        printSquare(4);
        printTriangle(4);
        printTriangle02(4);
    }
}
