import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = loadBooks();
        // Đọc file và khởi tạo thuộc tính cho đối tượng Library
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Book> loadBooks() {
        try {
            Gson gson = new Gson();
            FileReader fileReader = new FileReader("book.json");
            Type type = new TypeToken<ArrayList<Book>>() {}.getType();

            books = gson.fromJson(fileReader, type);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
        return books;
    }

    public ArrayList<Book> getBooksByCategory(String categoryName) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            String[] category = book.getCategory();
            if (contains(category, categoryName)) {
                result.add(book);
            }
        }
        return result;
    }

    public int getTotalBooksByCategory(String categoryName) {
        int count = 0;
        for (Book book : books) {
            String[] category = book.getCategory();
            if (contains(category, categoryName)) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Book> sortBookByPublishingYear() {
        ArrayList<Book> booksCopy = new ArrayList<>();
        booksCopy.addAll(books);

        Collections.sort(booksCopy, new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.getPublishingYear() - o2.getPublishingYear();
            }
        });

        return booksCopy;
    }

    public ArrayList<Book> searchBookByName(String name) {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equals(name)) {
                result.add(book);
            }
        }
        return result;
    }

    public boolean contains(String[] arr, String ele) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(ele)) {
                return true;
            }
        }
        return false;
    }
}
