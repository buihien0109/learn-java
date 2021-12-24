import java.util.Scanner;

public class Exercise_05 {
    private static Scanner scanner = new Scanner(System.in);

    private static String capitalizeString(String str) {
        String[] arr = str.toLowerCase().trim().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
        }

        return String.join(" ", arr);
    }

    private static void formatName() {
        System.out.println("1. Nhập vào tên : ");
        String name = scanner.nextLine();

        System.out.println("Tên sau khi chuẩn hóa : " + capitalizeString(name));
    }

    private static boolean isPalindromeString(String str) {
        String[] arr = str.split("");
        for (int i = 0; i < arr.length / 2; i++) {
            if (!arr[i].equals(arr[arr.length - i - 1])) {
                return false;
            }
        }
        return true;
    }

    private static void inputAndCheckPalindromeString() {
        System.out.println("2. Nhập vào chuỗi muốn kiểm tra : ");
        String str = scanner.nextLine();

        if (isPalindromeString(str)) {
            System.out.println(str + " là chuỗi palindrome");
        } else {
            System.out.println(str + " không là chuỗi palindrome");
        }
    }

    public static void run() {
        formatName();
        inputAndCheckPalindromeString();
    }
}
