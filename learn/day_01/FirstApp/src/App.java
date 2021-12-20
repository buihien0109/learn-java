public class App {
    // Khai báo biến toàn cục
    public static int point;

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Khai báo biến cục bộ
        int age;
        age = 25;

        long salary = 3000000L;

        float height = 1.5f;
        double weight = 60.5;

        char ch = 'a';
        point = 10;

        sayHello("Bùi Hiên");

        Person person = new Person();
        person.introduce();

        // Một số hàm tính toán
        System.out.println(Calculator.add(3, 4));
        System.out.println(Calculator.subtract(10, 5));
        System.out.println(Calculator.multiple(3, 4));
        System.out.println(Calculator.divide(12, 4));
        System.out.println(Calculator.compare(3, 4));
        System.out.println(Calculator.bmi(60, 1.6));
    }

    public static void sayHello(String name) {
        System.out.println("Xin chào " + name);
    }
}
