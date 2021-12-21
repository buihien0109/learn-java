import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private static Scanner scanner = new Scanner(System.in);
    private static int randomNumber;

    public static void play() {
        Random random = new Random();
        randomNumber = random.nextInt(100);

        int number;

        boolean isCorrect = false;
        while (!isCorrect) {
            System.out.println("Mời nhập số : ");
            number = scanner.nextInt();

            if(number == randomNumber) {
                System.out.println("Bạn đã đoán chính xác\nXin chúc mừng");
                isCorrect = true;
            } else if (number < randomNumber) {
                System.out.println("Số bạn cần đoán cần lớn hơn " + number);
            } else {
                System.out.println("Số bạn cần đoán cần nhỏ hơn " + number);
            }
        }
    }
}
