import java.util.Objects;

public abstract class Employee {
    private int id;
    private String name;
    private int age;
    private int basicSalary;

    public Employee(int id, String name, int age, int basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBasicSalary() {
        return basicSalary;
    }

    abstract int calculatorSalary();

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", basicSalary=" + basicSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && age == employee.age && basicSalary == employee.basicSalary && Objects.equals(name, employee.name);
    }
}
