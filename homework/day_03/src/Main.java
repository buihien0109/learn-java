import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bài 1
        System.out.println("Giải phương trình bậc nhất ax + b = 0");
        System.out.println("Nhập vào số a : ");
        double aVal = scanner.nextDouble();

        System.out.println("Nhập vào số b : ");
        double bVal = scanner.nextDouble();

        Equation.giaiPhuongTrinhBacNhat(aVal, bVal);

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

        Equation.giaiPhuongTrinhBacHai(a, b, c);

        // Bài 3
        char ch = 'o';
        System.out.printf("1. Số lần xuất hiện ký tự %c = %d\n\n", ch, StringEx.countCharacter(ch));
        System.out.println("2. Vị trí xuất hiện ký tự " + ch);
        StringEx.printPosition(ch);
    }
}
