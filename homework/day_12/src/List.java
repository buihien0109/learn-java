import java.util.ArrayList;

public class List <T extends Employee>{
    private ArrayList<T> employees;

    public List() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(T newEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            if(employees.get(i).equals(newEmployee)) {
                System.out.println(employees.get(i).getName() + " đã tồn tại trong danh sách");
                return;
            }
            if (employees.get(i).getId() == newEmployee.getId()) {
                System.out.println("Nhân viên không được trùng ID");
                return;
            }
        }

        employees.add(newEmployee);
        System.out.println(newEmployee.getName() + " đã được thêm vào danh sách");
    }

    public void showInfo() {
        for (T employee: employees) {
            System.out.println(employee);
        }
    }

    public int totalSalary() {
        int sum = 0;
        for (T employee: employees) {
            sum += employee.calculatorSalary();
        }
        return sum;
    }
}
