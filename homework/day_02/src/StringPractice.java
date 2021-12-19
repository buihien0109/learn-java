import java.util.Scanner;

public class StringPractice {
    public static void inputString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào chuỗi 1 : ");
        String str1 = sc.nextLine();

        System.out.print("Nhập vào chuỗi 2 : ");
        String str2 = sc.nextLine();

        System.out.printf("1 - Hai chuỗi \"%s\" và \"%s\" %s\n", str1, str2, str1.equals(str2) ? "BẰNG NHAU" : "KHÔNG BẰNG NHAU");
        System.out.printf("2 - Độ dài hai chuỗi \"%s\" và \"%s\" %s\n", str1, str2, str1.length() == str2.length() ? "BẰNG NHAU" : "KHÔNG BẰNG NHAU");
    }
}
