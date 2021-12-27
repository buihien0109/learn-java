import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Team allPlayers = new Team();

        allPlayers.addPlayer(new Player(1, "Bùi Tấn Trường", Position.GK));
        allPlayers.addPlayer(new Player(1, "Bùi Tấn Trường", Position.GK));

        allPlayers.addPlayer(new Player(3, "Nguyễn Văn Hoàng", Position.GK));
        allPlayers.addPlayer(new Player(4, "Quan Văn Chuẩn", Position.GK));
        allPlayers.addPlayer(new Player(5, "Đỗ Duy Mạnh", Position.DF));
        allPlayers.addPlayer(new Player(6, "Nguyễn Thành Chung", Position.DF));
        allPlayers.addPlayer(new Player(7, "Trần Đình Trọng", Position.DF));
        allPlayers.addPlayer(new Player(8, "Nguyễn Phong Hồng Duy", Position.DF));
        allPlayers.addPlayer(new Player(9, "Vũ Văn Thanh", Position.DF));
        allPlayers.addPlayer(new Player(10, "Bùi Tiến Dũng", Position.DF));
        allPlayers.addPlayer(new Player(11, "Quế Ngọc Hải", Position.DF));
        allPlayers.addPlayer(new Player(12, "Hồ Tấn Tài", Position.DF));
        allPlayers.addPlayer(new Player(13, "Phạm Xuân Mạnh", Position.DF));
        allPlayers.addPlayer(new Player(14, "Đỗ Thanh Thịnh", Position.DF));
        allPlayers.addPlayer(new Player(15, "Nguyễn Quang Hải", Position.MF));
        allPlayers.addPlayer(new Player(16, "Phạm Đức Huy", Position.MF));
        allPlayers.addPlayer(new Player(17, "Lương Xuân Trường", Position.MF));
        allPlayers.addPlayer(new Player(18, "Nguyễn Tuấn Anh", Position.MF));
        allPlayers.addPlayer(new Player(19, "Trần Minh Vương", Position.MF));
        allPlayers.addPlayer(new Player(20, "Phan Văn Đức", Position.MF));
        allPlayers.addPlayer(new Player(21, "Nguyễn Hoàng Đức", Position.MF));
        allPlayers.addPlayer(new Player(22, "Lý Công Hoàng Anh", Position.MF));
        allPlayers.addPlayer(new Player(23, "Phạm Tuấn Hải", Position.FW));
        allPlayers.addPlayer(new Player(24, "Nguyễn Văn Toàn", Position.FW));
        allPlayers.addPlayer(new Player(25, "Nguyễn Công Phượng", Position.FW));
        allPlayers.addPlayer(new Player(26, "Hà Đức Chinh", Position.FW));
        allPlayers.addPlayer(new Player(27, "Nguyễn Tiến Linh", Position.FW));

        boolean quit = false;
        int option = 0;

        printMenu();

        while (!quit) {
            System.out.println("Nhập lựa chọn : ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 0:
                    printMenu();
                    break;
                case 1:
                    allPlayers.getTeam(1, 4, 4, 2);
                    break;
                case 2:
                    allPlayers.getTeam(1, 4, 3, 3);
                    break;
                case 3:
                    allPlayers.getTeam(1, 3, 5, 2);
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("\t0. Hiển thị menu"
                + "\n\t1. 1GK - 4DF - 4MF - 2FW"
                + "\n\t2. 1GK - 4DF - 3MF - 3FW"
                + "\n\t3. 1GK - 3DF - 5MF - 2FW"
                + "\n\t4. Thoát"
        );
    }
}
