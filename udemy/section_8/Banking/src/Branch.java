import java.util.ArrayList;

public class Branch {
    // Tên chi nhánh
    private String name;

    // Danh sách khách hàng
    private ArrayList<Customer> customers;

    // Khởi tạo chi nhánh
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    // Trả về tên của chi nhánh
    public String getName() {
        return name;
    }

    // Trả về list khách hàng
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    // Thêm khách hàng
    public boolean newCustomer(String customerName, double initialAmount) {
        // Nếu khách hàng chưa tồn tại thì thêm khách hàng
        if (findCustomer(customerName) == null) {
            this.customers.add(new Customer(customerName, initialAmount));
            return true;
        }

        return false;
    }

    // Thêm giao dịch của khách hàng
    public boolean addCustomerTransaction(String customerName, double amount) {
        // Tìm kiếm khách hàng có tồn tại hay không
        Customer existingCustomer = findCustomer(customerName);

        // Nếu khách hàng tồn tại thì thêm giao dịch cho khách hàng
        if (existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }

    // Tìm kiếm khách hàng theo tên
    private Customer findCustomer(String customerName) {
        for (int i = 0; i < this.customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if (checkedCustomer.getName().equals(customerName)) {
                return checkedCustomer;
            }
        }

        return null;
    }
}
