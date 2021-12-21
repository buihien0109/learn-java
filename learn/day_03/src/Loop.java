public class Loop {

    //    Viết một chương trình để in ra các số từ 1 đến 100.
//    Trong đó những số nào chia hết cho 3 thì in chữ “Fizz”,
//    những số chia hết cho 5 thì in chữ “Buzz”,
//    còn những số chia hết cho cả 3 và 5 thì in chữ “FizzBuzz”
    public static void fizzBuzz() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    //    1, Viết chương trình cho phép nhập vào một số nguyên dương n,
//    tính tổng tất cả số chẵn trong khoảng từ 0 - n.
    public static int sumEvenNumber(int n) {
        int i = 0;
        int sum = 0;
        while (i <= n) {
            sum += i;
            i += 2;
        }
        return sum;
    }

    //    2, Viết chương trình liệt kê n số nguyên tố đầu tiên.
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int n) {
        int i = 2;
        int countOfNumber = 0;
        while (true) {
            if (isPrime(i)) {
                System.out.println("Số nguyên tố thứ " + (countOfNumber + 1) + " : " + i);
                countOfNumber++;
                if (countOfNumber == n) {
                    break;
                }
            }
            i++;
        }
    }

    //    1, Viết chương trình giải phương trình bậc nhất 1 ẩn ax + b = 0, với a và b nhập vào từ bàn phím
    public static void giaiPhuongTrinhBacNhat(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        } else {
            System.out.println("Phương trình có nghiệm duy nhất x = " + (-b / a));
        }
    }

    //    2, Viết chương trình giải phương trình bậc hai 1 ẩn ax2 + bx + c = 0 (a!=0),
//    với a, b, c nhập vào từ bàn phím
    public static void giaiPhuongTrinhBacHai(double a, double b, double c) {
        double delta = (b * b) - (4 * a * c);

        if (delta > 0) {
            double squareDelta = Math.sqrt(delta);
            System.out.println("Phương trình có 2 nghiệm phân biệt x1 = "
                + (-b + squareDelta) / (2 * a) + " x2 = " + (-b - squareDelta) / (2 * a)
            );
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b) / (2 * a));
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
