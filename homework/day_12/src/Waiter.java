import java.util.Objects;

public class Waiter extends  Employee{
    private int serviceCharge;

    public Waiter(int id, String name, int age, int basicSalary, int serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    @Override
    int calculatorSalary() {
        return serviceCharge + this.getBasicSalary();
    }

    @Override
    public String toString() {
        return super.toString() + ", serviceCharge=" + serviceCharge + ", salary=" + calculatorSalary();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Waiter waiter = (Waiter) o;
        return serviceCharge == waiter.serviceCharge;
    }
}
