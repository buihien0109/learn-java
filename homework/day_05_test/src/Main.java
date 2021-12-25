import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isQuit = false;
        int option = 0;

        // Hiển thị menu
        printMenu();

        // Nhập các lựa chọn -> chạy chương trình tương ứng
        while (!isQuit) {
            System.out.println("Nhập lựa chọn : ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    Exercise_01.run();
                    break;
                case 2:
                    Exercise_02.run();
                    break;
                case 3:
                    Exercise_03.run();
                    break;
                case 4:
                    Exercise_04.run();
                    break;
                case 5:
                    Exercise_05.run();
                    break;
                case 6:
                    Exercise_06.run();
                    break;
                case 7:
                    isQuit = true;
                    break;
            }
        }
    }

    // Hiển thị nội dung của menu
    public static void printMenu() {
        System.out.println("\t 0 - Hiển thị menu");
        System.out.println("\t 1 - Bài 1");
        System.out.println("\t 2 - Bài 2");
        System.out.println("\t 3 - Bài 3");
        System.out.println("\t 4 - Bài 4");
        System.out.println("\t 5 - Bài 5");
        System.out.println("\t 6 - Bài 6");
        System.out.println("\t 7 - Thoát chương trình");
    }
}
