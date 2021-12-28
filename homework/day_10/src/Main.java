import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Company company = new Company();

    public static void main(String[] args) {
        // Thêm 1 vài khách hàng vào danh sách
        company.addCustomer(new Customer(1, "Bùi Hiên", "01-09-1997", Gender.MALE,
                "Thái Bình", "0344005816", "hien@gmail.com"));
        company.addCustomer(new Customer(2, "Nguyễn Thu Hằng", "31-10-1997", Gender.FEMALE,
                "Hưng Yên", "0356938293", "hang@gmail.com"));
        company.addCustomer(new Customer(3, "Nguyễn Minh Duy", "15-12-1997", Gender.MALE,
                "Thái Bình", "0982372637", "duy@gmail.com"));
        company.addCustomer(new Customer(4, "Nguyễn Bích Ngọc", "11-05-1999", Gender.FEMALE,
                "Nam Định", "0938272834", "ngoc@gmail.com"));

        boolean quit = false;
        int option = 0;

        while (!quit) {
            printMenu();

            System.out.println("Nhập lựa chọn : ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    company.showInfoCustomer();
                    break;
                case 2:
                    showInfoCustomer();
                    break;
                case 3:
                    addCustomer();
                    break;
                case 4:
                    findCustomer();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    public static void addCustomer() {
        System.out.println("Nhập vào thông tin khách hàng");
        System.out.print("Nhập ID : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên : ");
        String name = scanner.nextLine();
        System.out.print("Nhập ngày sinh : ");
        String birthday = scanner.nextLine();
        System.out.print("Nhập giới tính : ");
        Gender gender = Gender.valueOf(scanner.nextLine());
        System.out.print("Nhập địa chỉ : ");
        String address = scanner.nextLine();
        System.out.print("Nhập số điện thoại : ");
        String phone = scanner.nextLine();
        System.out.print("Nhập email : ");
        String email = scanner.nextLine();

        Customer customer = new Customer(id, name, birthday, gender, address, phone, email);
        company.addCustomer(customer);
    }

    public static void showInfoCustomer() {
        boolean quit = false;
        int option = 0;

        while (!quit) {
            printSubMenu1();

            System.out.println("Nhập lựa chọn : ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    company.showInfoCustomer(Gender.MALE);
                    break;
                case 2:
                    company.showInfoCustomer(Gender.FEMALE);
                    break;
                case 3:
                    quit = true;
                    break;
            }
        }
    }

    // Tìm kiếm customer theo ID
    public static void findCustomer() {
        System.out.print("Nhập ID muốn tìm kiếm : ");
        int id = Integer.parseInt(scanner.nextLine());

        int postition = company.findCustomer(id);

        if (postition == -1) {
            System.out.println("Không tìm thấy khách hàng có ID = " + id + " trong danh sách");
        } else {
            updateInfoCustomer(postition);
        }
    }

    // Cập nhật thông tin của customer
    public static void updateInfoCustomer(int postion) {
        boolean quit = false;
        int option = 0;

        while (!quit) {
            printSubMenu2();

            System.out.println("Nhập lựa chọn : ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    company.showInfoCustomer(Gender.MALE);
                    break;
                case 2:
                    company.showInfoCustomer(Gender.FEMALE);
                    break;
                case 3:
                    quit = true;
                    break;
            }
        }
    }

    // Hiển thị menu chính
    public static void printMenu() {
        System.out.println("\t1. Xem thông tin toàn bộ khách hàng");
        System.out.println("\t2. Xem thông tin khách hàng theo giới tính");
        System.out.println("\t3. Thêm thông tin 1 khách hàng vào danh sách");
        System.out.println("\t4. Tìm kiếm thông tin khách hàng theo ID");
        System.out.println("\t5. Thoát");
    }

    // Menu về giới tính
    public static void printSubMenu1() {
        System.out.println("\t1. Xem thông tin khách hàng nam");
        System.out.println("\t2. Xem thông tin khách hàng nữ");
        System.out.println("\t3. Thoát khỏi submenu");
    }

    // Menu về tìm kiếm khách hàng
    public static void printSubMenu2() {
        System.out.println("\t1. Sửa thông tin khách hàng");
        System.out.println("\t2. Xóa thông tin khách hàng");
        System.out.println("\t3. Thoát khỏi submenu");
    }
}
