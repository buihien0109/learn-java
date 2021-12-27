import java.util.Objects;

public class Film {
    private int id;
    private String name;
    private String category;
    private int length;
    private String producer;
    private int year;

    public Film(int id, String name, String category, int length, String producer, int year) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.length = length;
        this.producer = producer;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", length=" + length +
                ", producer='" + producer + '\'' +
                ", year=" + year +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return id == film.id && length == film.length && year == film.year && Objects.equals(name, film.name) && Objects.equals(category, film.category) && Objects.equals(producer, film.producer);
    }
}
