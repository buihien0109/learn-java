import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;

public class ListFilm {
    private ArrayList<Film> films;

    public ListFilm() {
        this.films = loadFilmsFromFile("film.json");
    }

    // Đọc danh sách film từ file json
    private ArrayList<Film> loadFilmsFromFile(String fileName) {
        ArrayList<Film> listFilm = new ArrayList<>();
        try {
            Gson gson = new Gson();
            FileReader fileReader = new FileReader(fileName);
            Type type = new TypeToken<ArrayList<Film>>() {
            }.getType();

            listFilm = gson.fromJson(fileReader, type);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        return listFilm;
    }

    // Hiển thị danh sách film
    public void showFilm(ArrayList<Film> list) {
        for (Film film : list) {
            System.out.println(film);
        }
    }

    // Sắp xếp film theo tên
    public void sortFilmByName() {
        ArrayList<Film> filmsCopy = new ArrayList<>();
        filmsCopy.addAll(films);

        Collections.sort(filmsCopy, Film.filmNameComparator);
        showFilm(filmsCopy);
    }

    // Sắp xếp film theo thời lượng
    public void sortFilmByLength() {
        ArrayList<Film> filmsCopy = new ArrayList<>();
        filmsCopy.addAll(films);

        Collections.sort(filmsCopy, Film.filmLengthComparator);
        showFilm(filmsCopy);
    }

    // Sắp xếp film theo lượt xem
    public void sortFilmByView() {
        ArrayList<Film> filmsCopy = new ArrayList<>();
        filmsCopy.addAll(films);

        Collections.sort(filmsCopy, Film.filmViewComparator);
        showFilm(filmsCopy);
    }

    public ArrayList<Film> getFilms() {
        return films;
    }
}
