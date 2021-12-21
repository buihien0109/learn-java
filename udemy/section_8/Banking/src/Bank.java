import java.util.ArrayList;

public class Bank {
    // Tên ngân hàng
    private String name;

    // Danh sách chi nhánh
    private ArrayList<Branch> branches;

    // Khởi tạo ngân hàng với tên
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    // Thêm chi nhánh
    public boolean addBranch(String branchName) {
        // Nếu chi nhánh chưa tồn tại thì thêm vào
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    // Thêm khách hàng
    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        // Tìm kiếm chi nhánh theo tên
        Branch branch = findBranch(branchName);

        // Nếu chi nhánh đã tồn tạo thì thêm khách hàng và số tiền giao dịch
        if(branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }

        return false;
    }

    // Thêm giao dịch cho khách hàng
    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
        // Tìm kiếm chi nhánh theo tên
        Branch branch = findBranch(branchName);

        // Nếu chi nhánh đã tồn tạo thì thêm giao dịch cho khách hàng
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, amount);
        }

        return false;
    }

    // Tìm kiếm chi nhánh theo tên
    private Branch findBranch(String branchName) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch checkedBranch = this.branches.get(i);
            if(checkedBranch.getName().equals(branchName)) {
                return checkedBranch;
            }
        }

        return null;
    }

    // Hiển thị danh sách giao dịch của tất cả khách hàng theo chi nhánh
   public boolean listCustomers(String branchName, boolean showTransactions) {
        // Tìm kiếm chi nhánh theo tên
       Branch branch = findBranch(branchName);

       // Nếu chi nhánh tồn tại thì in ra thông tin của khách hàng của chi nhánh đó
       if(branch != null) {
           System.out.println("Customer details for branch " + branch.getName());

           // Lấy danh sách khách hàng của cho nhánh
           ArrayList<Customer> branchCustomers = branch.getCustomers();

           // Duyệt qua danh sách để in thông tin của khách hàng và lịch sử giao dịch
           for(int i=0; i<branchCustomers.size(); i++) {
               Customer branchCustomer = branchCustomers.get(i);
               System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");

               // Nếu có option "showTransactions" thì hiển thị
               // Còn không thì thôi
               if(showTransactions) {
                   System.out.println("Transactions");

                   // Lấy danh sách giao dịch của khách hàng
                   ArrayList<Double> transactions = branchCustomer.getTransactions();
                   for(int j=0; j<transactions.size(); j++) {
                       System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                   }
               }
           }
           return true;
       } else {
           return false;
       }
   }





























}
