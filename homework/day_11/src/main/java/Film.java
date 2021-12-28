import java.util.Comparator;

public class Film {
    private int id;
    private String name;
    private String category;
    private String director;
    private int length;
    private String date;
    private int view;

    public Film(int id, String name, String category, String director, int length, String date, int view) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.director = director;
        this.length = length;
        this.date = date;
        this.view = view;
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getView() {
        return view;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", director='" + director + '\'' +
                ", length=" + length +
                ", date='" + date + '\'' +
                ", view=" + view +
                '}';
    }

    public static Comparator<Film> filmNameComparator = new Comparator<Film>() {
        public int compare(Film f1, Film f2) {
            String filmName1 = f1.getName().toUpperCase();
            String filmName2 = f2.getName().toUpperCase();

            // Sắp xếp tăng dần
            return filmName1.compareTo(filmName2);

            // Sắp xếp giảm dần
            //return filmName2.compareTo(filmName1);
        }};

    public static Comparator<Film> filmLengthComparator = new Comparator<Film>() {
        public int compare(Film f1, Film f2) {
            int filmLength1 = f1.getLength();
            int filmLength2 = f2.getLength();

            // Sắp xếp tăng dần
            return filmLength1 - filmLength2;

            // Sắp xếp giảm dần
            //return filmLength2 - filmLength1;
        }};

    public static Comparator<Film> filmViewComparator = new Comparator<Film>() {
        public int compare(Film f1, Film f2) {
            int filmView1 = f1.getView();
            int filmView2 = f2.getView();

            // Sắp xếp tăng dần
            return filmView1 - filmView2;

            // Sắp xếp giảm dần
            //return filmView2 - filmView1;
        }};
}
