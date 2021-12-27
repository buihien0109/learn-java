import java.util.ArrayList;

public class Cinema {
    ArrayList<Film> films = new ArrayList<>();

    public Cinema() {
        this.films = new ArrayList<>();
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void addFilm(Film newFilm) {
        for (Film film : films) {
            if (film.equals(newFilm)) {
                System.out.println("Film " + newFilm.getName() + " đã có trong danh sách");
                return;
            }
            if (film.getId() == newFilm.getId()) {
                System.out.println("Mã film không được trùng nhau");
                return;
            }
        }
        films.add(newFilm);
        System.out.println("Film : " + newFilm.getName() + " đã được thêm vào danh sách");
    }

    public void showFilm(ArrayList<Film> listFilm) {
        for (Film film : listFilm) {
            System.out.println(film);
        }
    }

    public void getFilmsByCategory(String category) {
        ArrayList<Film> listFilm = new ArrayList<>();
        for (int i = 0; i < films.size(); i++) {
            if(films.get(i).getCategory().equals(category)) {
                listFilm.add(films.get(i));
            }
        }
        showFilm(listFilm);
    }


}
