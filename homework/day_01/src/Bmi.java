public class Bmi {
    public static void calculateBmi() {
        double height = 1.7;
        double weight = 60;
        double bmi = weight / (height * height);

        System.out.printf("BMI 1 = %.2f\n", bmi);
    }

    public static double calculateBmiNoParameter() {
        double height = 1.7;
        double weight = 60;

        return weight / (height * height);
    }

    public static double calculateBmiWithParameter(double weight, double height) {
        return weight / (height * height);
    }
}
