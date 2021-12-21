import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Bài 1 ==========================
//        System.out.println("Nhập cân nặng (kg)");
//        double weight = scanner.nextDouble();
//
//        System.out.println("Nhập chiều cao (m)");
//        double height = scanner.nextDouble();
//
//        Bmi bmi = new Bmi(weight, height);
//        double result = bmi.calculateBmi();
//        System.out.printf("BMI = %.2f -> %s", result, bmi.printInfo(result));

//        Bài 2 ==========================
//        System.out.println("Nhập cạnh A");
//        int sideA = scanner.nextInt();
//
//        System.out.println("Nhập cạnh B");
//        int sideB = scanner.nextInt();
//
//        System.out.println("Nhập cạnh C");
//        int sideC = scanner.nextInt();
//
//        Triangle triangle = new Triangle(sideA, sideB, sideC);
//        System.out.printf("Kết quả : %s\n", triangle.isTriangle() ? "có là tam giác" : "không là tam giác");
//
//        System.out.println("Nhập vào tháng");
//        int monthValue = scanner.nextInt();
//
//        Bài 3 ==========================
//        Month month = new Month(monthValue);
//        month.getDayOfMonth();

//        for (int i = 0; i < 10; i++) {
//            int monthValue = randomNumber(1, 20);
//            Month month = new Month(monthValue);
//            month.getDayOfMonth();
//        }
//
//      Bài 5 ==========================
//        System.out.println("===== Nhập vào số học viên");
//        int totalStudent = Integer.parseInt(scanner.nextLine());
//
//        ClassStudent classStudent = new ClassStudent(totalStudent);
//        System.out.println("\n===== Nhập vào thông tin học viên");
//
//        for (int i = 0; i < totalStudent; i++) {
//            System.out.println("Học viên " + (i + 1));
//            System.out.print("Nhập tên : ");
//            String name = scanner.nextLine();
//            System.out.print("Nhập tuổi : ");
//            int age = Integer.parseInt(scanner.nextLine());
//            System.out.print("Nhập địa chỉ : ");
//            String address = scanner.nextLine();
//            System.out.println();
//
//            Student student = new Student(name, age, address);
//            classStudent.addStudent(student);
//        }
//
//        classStudent.printStudents();

//        1, Viết chương trình cho phép nhập vào một số nguyên dương n,
//                tính tổng tất cả số chẵn trong khoảng từ 0 - n.
//        System.out.print("Nhập số : ");
//        int n = scanner.nextInt();
//        System.out.println("Tổng các số chẵn từ 0 -> " + n + " là : " + Loop.sumEvenNumber(n));

//        2, Viết chương trình liệt kê n số nguyên tố đầu tiên.
//        System.out.print("Nhập số lượng số nguyên tố cần in: ");
//        int n = scanner.nextInt();
//
//        System.out.println("\nDanh sách số nguyên tố: ");
//        Loop.printPrime(n);

//        Game đoán số
        GuessNumber.play();
    }

    public static int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
}
