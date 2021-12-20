public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account() {
        this("1", 1000, "Default Name", "Default Email", "Default Phone");
        System.out.println("Empty Constructor");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("2", 1000, customerName, customerEmailAddress, customerPhoneNumber);
    }

    public void deposit(double depositAmount) {
        balance += depositAmount;
        System.out.println("Gửi thêm " + depositAmount + " vào tài khoản. Số tiền hiện tại là " + balance);
    }

    public void withdrawal(double withdrawalAmount) {
        if (balance - withdrawalAmount <= 0) {
            System.out.println("Số tiền khả dụng : " + balance + ". Không thể xử lý yêu cầu");
        } else {
            balance -= withdrawalAmount;
            System.out.println("Số tiền đã rút : " + withdrawalAmount + ". Số tiền còn lại trong tài khoản : " + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public static void main(String[] args) {
        // Account account = new Account();
        Account account = new Account("1234", 100, "Bùi Hiên", "hien@techmaster.vn", "0344005816");
        account.withdrawal(100);
        account.deposit(50);
        account.withdrawal(100);

        account.deposit(51);
        account.withdrawal(100);
    }
}
