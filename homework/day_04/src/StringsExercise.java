import java.util.Scanner;

public class StringsExercise {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] strings;

    // Chạy chương trình
    public static void run() {
        input();
        print();
        countWord("Java");
        printPositionWord();
    }

    // Nhập vào số lượng phần tử
    // Nhập vào từng phần tử của mảng
    public static void input() {
        System.out.println("1. Nhập vào số lượng phần tử : ");
        int numbers = Integer.parseInt(scanner.nextLine());
        strings = new String[numbers];

        for (int i = 0; i < strings.length ; i++) {
            System.out.println("Nhập vào phần tử thứ " + i);
            strings[i] = scanner.nextLine();
        }
    }

    // In các giá trị của mảng
    public static void print() {
        System.out.println("2. In mảng");
        for (int i = 0; i < strings.length ; i++) {
            System.out.println("Phần tử thứ " + i + " : " + strings[i]);
        }
    }

    // Đếm số lượng chuỗi bất kỳ có trong mảng
    public static void countWord(String str) {
        int count = 0;
        for (int i = 0; i < strings.length ; i++) {
            if(strings[i].equals(str)) {
                count++;
            }
        }
        System.out.println("3. Phần tử \"" + str + "\" xuất hiện " + count + " lần trong mảng.");
    }

    // Lấy vị trí xuất hiện của phần tử trong mảng
    public static void printPositionWord() {
        System.out.println("4. Nhập vào phần tử muốn kiểm tra vị trí: ");
        String str = scanner.nextLine();

        getPositionWord(str);
    }

    public static void getPositionWord(String str) {
        boolean isExist = false;
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].equals(str)) {
                System.out.println("Phần tử " + str + " xuất hiện ở vị trí : " + i);
                isExist = true;
            }
        }

        if(!isExist) {
            System.out.println("Phần tử " + str + " không xuất hiện trong mảng");
        }
    }
}
