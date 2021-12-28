import java.util.Objects;

public class Kitchen extends Employee{
    private int compensate;

    public Kitchen(int id, String name, int age, int basicSalary, int compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    @Override
    int calculatorSalary() {
        return compensate + this.getBasicSalary();
    }

    @Override
    public String toString() {
        return super.toString() + ", compensate=" + compensate + ", salary=" + calculatorSalary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kitchen kitchen = (Kitchen) o;
        return compensate == kitchen.compensate;
    }
}
