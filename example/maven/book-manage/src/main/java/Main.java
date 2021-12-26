import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        Library<TextBook> library = new Library<>();

        TextBook textBook = new TextBook(1, "Sách giáo khoa toán", "Sách giáo khoa",
                "Bùi Hiên", 2018, "Kim Đồng", 100, 1000);

        library.addBook(textBook);

        for (Book book : library.getLibrary()) {
            System.out.println(book);
        }

        System.out.println(faker.random().nextInt(100));
        System.out.println(faker.book().title());
        System.out.println(faker.book().author());
        System.out.println(faker.random().nextInt(1990, 2020));
//        String streetName = faker.address().streetName();
//        String number = faker.address().buildingNumber();
//        String city = faker.address().city();
//        String country = faker.address().country();
//
//        System.out.println(String.format("%s\n%s\n%s\n%s",
//                number,
//                streetName,
//                city,
//                country));
    }
}
