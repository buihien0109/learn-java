import java.util.ArrayList;

public class Customer {
    // Tên khách hàng
    private String name;

    // Lịch sử giao dịch
    private ArrayList<Double> transactions;

    // Khởi tạo khách hàng
    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initialAmount);
    }

    // Thêm giao dịch
    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    // Trả về tên khách hàng
    public String getName() {
        return name;
    }

    // Trả về list giao dịch của khách hàng
    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
