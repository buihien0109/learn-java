import java.util.Random;

public class Exercise_03 {
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

    // Ramdom 1 số và kiểm tra số đó có phải là số nguyên tố hay không
    private static void randomAndCheckPrimeNumber() {
        Random random = new Random();
        int number = random.nextInt(20);

        if (isPrimeNumber(number)) {
            System.out.println(number + " là số nguyên tố");
        } else {
            System.out.println(number + " không là số nguyên tố");
        }
    }

    public static void run() {
        for (int i = 0; i < 10; i++) {
            randomAndCheckPrimeNumber();
        }
    }
}
