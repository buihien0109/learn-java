public class App {
    public static void main(String[] args) throws Exception {
        // Bài 1
        System.out.println("===== Bài 1 =====");
        System.out.println(Calculator.add(3, 4));
        System.out.println(Calculator.subtract(10, 5));
        System.out.println(Calculator.multiple(2, 3));
        System.out.println(Calculator.divide(12, 4));

        // Bài 2
        System.out.println("\n===== Bài 2 =====");
        Bmi.calculateBmi();
        System.out.printf("BMI 2 = %.2f\n", Bmi.calculateBmiNoParameter());
        System.out.printf("BMI 3 = %.2f\n", Bmi.calculateBmiWithParameter(60, 1.7));

        // Trả lời
        System.out.println("\nPhương thức 3 là tốt nhất vì có thể tính toán linh động với nhiều giá trị đối số khác nhau, và có thể tận dụng kết quả trả về của phương thức đề làm những thao tác về sau =))");
    }
}
