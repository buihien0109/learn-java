public class Bmi {
    private double weight;
    private double height;

    public Bmi(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBmi() {
        return weight / (height * height);
    }

    public String printInfo(double bmi) {
        if (bmi < 18.5) {
            return "Thiếu cân";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Cân đối";
        } else {
            return "Thừa cân";
        }
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }
}
