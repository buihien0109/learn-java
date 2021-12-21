import java.util.Scanner;

public class Equation {

    // 1, Viết chương trình giải phương trình bậc nhất 1 ẩn ax + b = 0, với a và b nhập vào từ bàn phím
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

    // 2, Viết chương trình giải phương trình bậc hai 1 ẩn ax2 + bx + c = 0 (a!=0),
    // với a, b, c nhập vào từ bàn phím
    public static void giaiPhuongTrinhBacHai(double a, double b, double c) {
        double delta = (b * b) - (4 * a * c);

        if (delta > 0) {
            double squareDelta = Math.sqrt(delta);
            System.out.println("Phương trình có 2 nghiệm phân biệt x1 = "
                    + (-b + squareDelta) / (2 * a) + " và x2 = " + (-b - squareDelta) / (2 * a)
            );
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép x1 = x2 = " + (-b) / (2 * a));
        } else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bài 1
        System.out.println("Giải phương trình bậc nhất ax + b = 0");
        System.out.println("Nhập vào số a : ");
        double aVal = scanner.nextDouble();
        System.out.println("Nhập vào số b : ");
        double bVal = scanner.nextDouble();

        giaiPhuongTrinhBacNhat(aVal, bVal);

        // Bài 2
        System.out.println("Giải phương trình nhất ax2 + bx + c = 0 (a != 0)");
        System.out.println("Nhập vào số a : ");
        double a;
        do {
            a = scanner.nextDouble();
            if (a == 0) {
                System.out.println("Giá trị của a phải khác 0. Nhập lại số a : ");
            }
        } while (a == 0);

        System.out.println("Nhập vào số b : ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào số c : ");
        double c = scanner.nextDouble();

        giaiPhuongTrinhBacHai(a, b, c);
    }
}
