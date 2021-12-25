public class Exercise_04 {
    // Kiểm tra số nguyên tố
    private static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Lấy ra danh sách n số nguyên tố đầu tiên
    private static void printNPrimeNumberFirst(int n) {
        int i = 2;
        int countOfNumber = 0;
        while (true) {
            if (isPrimeNumber(i)) {
                System.out.println("Số nguyên tố thứ " + (countOfNumber + 1) + " : " + i);
                countOfNumber++;
                if (countOfNumber == n) {
                    break;
                }
            }
            i++;
        }
    }

    // In ra các số nguyên tố nhỏ hơn N
    private static void printPrimeNumberLessN(int n) {
        for (int i = 0; i < n; i++) {
            if (isPrimeNumber(i)) {
                System.out.printf("%-2d", i);
            }
        }
    }

    public static void run() {
        System.out.println("1. Liệt kê 10 số nguyên tố đầu tiên");
        printNPrimeNumberFirst(10);

        System.out.println("2. Liệt kê các số nguyên tố nhỏ hơn 10");
        printPrimeNumberLessN(10);
    }
}
