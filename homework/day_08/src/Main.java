import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cinema cinema = new Cinema();

        // Thêm 1 số bộ film
        cinema.addFilm(new Film(1, "Film 1", "Action", 120, "NSX-1", 2019));
        cinema.addFilm(new Film(2, "Film 2", "Gangster", 127, "NSX-3", 2021));
        cinema.addFilm(new Film(3, "Film 3", "Adventure", 100, "NSX-2", 2016));
        cinema.addFilm(new Film(4, "Film 4", "Action", 99, "NSX-1", 2017));
        cinema.addFilm(new Film(5, "Film 5", "Adventure", 124, "NSX-1", 2019));
        cinema.addFilm(new Film(6, "Film 6", "Hisorical", 130, "NSX-2", 2020));
        cinema.addFilm(new Film(7, "Film 7", "Action", 110, "NSX-3", 2021));

        // In thông tin film
        System.out.println("\n1. Danh sách tất cả film");
        cinema.showFilm(cinema.getFilms());

        
        // In ra các phim thuộc thể loại "Action"
        System.out.println("\n2. Danh sách tất cả film thuộc thể loại Action");
        cinema.getFilmsByCategory("Action");
    }
}
