import com.google.gson.Gson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
//        Gson gson = new Gson();
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        ArrayList<Person> persons = new ArrayList<>();

        try {
            FileReader fileReader = new FileReader("student.json");
            Type type = new TypeToken<ArrayList<Person>>() {
            }.getType();

            System.out.println(type);

            persons = gson.fromJson(fileReader, type);

            for (Person person : persons) {
                System.out.println(person);
            }

            Person newPerson = new Person(5, "No Name", "noname@gmail.com", 70);
            persons.add(newPerson);

            FileWriter fileWriter = new FileWriter("student_output.json");
            gson.toJson(persons, fileWriter);

            fileWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println("File not found!");
        } finally {
            System.out.println("Xong");
        }
    }
}
