import java.util.ArrayList;
import java.util.Scanner;

public class CongTy {
    Scanner scanner = new Scanner(System.in);
    ArrayList<NhanVien> list;

    public CongTy() {
        this.list = new ArrayList<>();
    }

    public void input() {
        System.out.print("Nhập số lượng nhân viên : ");
        int number = Integer.parseInt(scanner.nextLine());

        int option = 0;

        while (number != 0) {
            printOption();

            System.out.print("\nLoại nhân viên cần nhập : ");
            option = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập mã nhân viên : ");
            int maNhanVien = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập họ tên : ");
            String hoTen = scanner.nextLine();

            System.out.print("Nhập tuổi : ");
            int tuoi = Integer.parseInt(scanner.nextLine());

            System.out.print("Nhập số điện thoại : ");
            String soDienThoai = scanner.nextLine();

            System.out.print("Nhập email : ");
            String email = scanner.nextLine();

            System.out.print("Nhập lương cơ bản : ");
            int luongCoBan = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1: {
                    System.out.print("Nhập số giờ Overtime : ");
                    int soGioOvertime = Integer.parseInt(scanner.nextLine());

                    LapTrinhVien lapTrinhVien = new LapTrinhVien(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan, soGioOvertime);
                    list.add(lapTrinhVien);

                    break;
                }
                case 2: {
                    System.out.print("Nhập số lỗi phát hiện : ");
                    int soLoiPhatHien = Integer.parseInt(scanner.nextLine());

                    KiemChungVien kiemChungVien = new KiemChungVien(maNhanVien, hoTen, tuoi, soDienThoai, email, luongCoBan, soLoiPhatHien);
                    list.add(kiemChungVien);

                    break;
                }
            }
            number--;
        }
    }

    public void printOption() {
        System.out.println("\nLoại nhân viên : ");
        System.out.println("1. Lập trình viên");
        System.out.println("2. Kiểm chứng viên");
    }

    public void print() {
        System.out.println("\n2. Thông tin nhân viên");
        for (NhanVien nhanvien: list) {
            System.out.println(nhanvien);
        }
    }
}
