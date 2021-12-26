import java.util.ArrayList;

public class Library<T extends Book>{  //implements Comparable<Library<T>>
    private ArrayList<T> library = new ArrayList<>();

    public ArrayList<T> getLibrary() {
        return library;
    }

    public void addBook(T book) {
        if (library.contains(book)) {
            System.out.println(book.getName() + " đã có trong thư viện");
        } else {
            library.add(book);
            System.out.println(book.getName() + " đã được thêm vào trong thư viện");
        }
    }

    public void findElectronicDocumentMostDownload(int count) {
        // Sắp xếp giảm dần

        // Lấy ra count phần tử đầu tiên
    }

//    @Override
//    public int compareTo(Library<T> library) {
//        if(library.() > team.ranking()) {
//            return -1;
//        } else if(this.ranking() < team.ranking()) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }
}
