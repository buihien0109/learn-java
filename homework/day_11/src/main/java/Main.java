import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListFilm listFilm = new ListFilm();

        boolean quit = false;
        int option = 0;

        while (!quit) {
            printMenu();

            System.out.println("Nhập lựa chọn : ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    listFilm.showFilm(listFilm.getFilms());
                    break;
                case 2:
                    listFilm.sortFilmByName();
                    break;
                case 3:
                    listFilm.sortFilmByLength();
                    break;
                case 4:
                    listFilm.sortFilmByView();
                    break;
                case 5:
                    quit = true;
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("\t1. Hiển thị danh sách film");
        System.out.println("\t2. Sắp xếp film theo tên");
        System.out.println("\t3. Sắp xếp film theo thời lượng");
        System.out.println("\t4. Sắp xếp film theo lượt xem");
        System.out.println("\t5. Thoát");
    }
}
