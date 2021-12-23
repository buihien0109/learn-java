public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng với String data
        GenericClass<String> message = new GenericClass<>("Xin chào các bạn");
        System.out.println(message.getMyValue());

        // Khởi tạo đối tượng với Interger data
        GenericClass<Integer> number = new GenericClass<>(24);
        System.out.println(number.getMyValue());

        // Generics Method
        message.<String>printValue();
        number.<Integer>printValue();
    }
}
