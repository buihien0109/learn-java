import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Library library = new Library();

    public static void main(String[] args) {

        boolean isQuit = false;
        int option = 0;

        // Nhập các lựa chọn -> chạy chương trình tương ứng
        while (!isQuit) {
            // Hiển thị menu
            printMenu();

            System.out.println("Nhập lựa chọn : ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    getBooks();
                    break;
                case 2:
                    getBooksByCategory();
                    break;
                case 3:
                    getTotalBooksByCategory();
                    break;
                case 4:
                    sortBookByPublishingYear();
                    break;
                case 5:
                    searchBookByName();
                    break;
                case 6:
                    isQuit = true;
                    break;
            }
        }
    }

    // Hiển thị nội dung của menu
    public static void printMenu() {
        System.out.println("\t 1 - In danh sách toàn bộ sách");
        System.out.println("\t 2 - Lọc sách theo thể loại");
        System.out.println("\t 3 - Đếm sách theo thể loại");
        System.out.println("\t 4 - Sắp xếp sách theo năm xuất bản");
        System.out.println("\t 5 - Tìm sách theo tên");
        System.out.println("\t 6 - Thoát chương trình");
    }

    // In book
    public static void printBooks(ArrayList<Book> books) {
        for (Book book: books) {
            System.out.println(book);
        }
    }

    // Lấy danh sách toàn bộ book và in ra
    public static void getBooks() {
        ArrayList<Book> books = library.getBooks();
        printBooks(books);
    }

    // Lọc sách theo thể loại
    public static void getBooksByCategory() {
        System.out.println("Nhập thể loại : ");
        String categoryName = scanner.nextLine();

        ArrayList<Book> books = library.getBooksByCategory(categoryName);

        printBooks(books);
    }

    // Đếm sách theo thể loại
    public static void getTotalBooksByCategory() {
        System.out.println("Nhập thể loại : ");
        String categoryName = scanner.nextLine();

        System.out.println("Số lượng sách thuộc thể loại " + categoryName + " là : "
                + library.getTotalBooksByCategory(categoryName));
    }

    //Sắp xếp sách theo năm xuất bản
    public static void sortBookByPublishingYear() {
        ArrayList<Book> books = library.sortBookByPublishingYear();

        printBooks(books);
    }

    // Tìm sách theo tên
    public static void searchBookByName() {
        System.out.println("Nhập tên sách : ");
        String bookName = scanner.nextLine();

        ArrayList<Book> books = library.searchBookByName(bookName);

        printBooks(books);
    }
}
