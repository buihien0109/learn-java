public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber other) {
        this.real -= other.real;
        this.imaginary -= other.imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public static void main(String[] args) {
        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber two = new ComplexNumber(2.5, -1.5);

        one.add(1,1);

        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());

        one.subtract(two);

        System.out.println("one.real = " + one.getReal());
        System.out.println("one.imaginary = " + one.getImaginary());

        two.subtract(one);

        System.out.println("two.real = " + two.getReal());
        System.out.println("two.imaginary = " + two.getImaginary());
    }
}
