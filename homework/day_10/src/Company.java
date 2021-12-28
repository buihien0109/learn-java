import java.util.ArrayList;

public class Company {
    ArrayList<Customer> customers;

    public Company() {
        this.customers = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void addCustomer(Customer newCustomer) {
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).equals(newCustomer)) {
                System.out.println(customers.get(i).getName() + " đã tồn tại trong danh sách");
                return;
            }
            if (customers.get(i).getId() == newCustomer.getId()) {
                System.out.println("Khách hàng không được trùng ID");
                return;
            }
        }
        if (!Validate.validateEmail(newCustomer.getEmail())) {
            System.out.println(newCustomer.getEmail() + " không đúng định dạng");
            return;
        }
        if (!Validate.validatePhone(newCustomer.getPhone())) {
            System.out.println(newCustomer.getPhone() + " không đúng định dạng");
            return;
        }
        customers.add(newCustomer);
        System.out.println(newCustomer.getName() + " đã được thêm vào danh sách");
    }

    public void showInfoCustomer() {
        for (Customer customer: customers) {
            System.out.println(customer);
        }
    }

    public void showInfoCustomer(Gender gender) {
        for (Customer customer: customers) {
            if(customer.getGender().equals(gender)) {
                System.out.println(customer);
            }
        }
    }

    public int findCustomer(int customerId) {
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).getId() == customerId) {
                return i;
            }
        }
        return -1;
    }

    public boolean findCustomer(Customer customer) {
        for (int i = 0; i < customers.size(); i++) {
            if(customers.get(i).equals(customer)) {
                return true;
            }
        }
        return false;
    }

    public void removeCustomer(Customer customer) {
        boolean isFind = findCustomer(customer);
        if(!isFind) {
            System.out.println(customer.getName() + " không có trong danh sách khách hàng");
        }
        customers.remove(customer);
        System.out.println(customer.getName() + " đã được xóa khỏi danh sách khách hàng");
    }
}
