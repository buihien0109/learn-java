public class Main {
    public static void main(String[] args) {
        // Waiter
        Waiter waiter1 = new Waiter(1, "Nguyễn Minh Duy", 24, 2000000, 1000000);
        Waiter waiter2 = new Waiter(2, "Trịnh Hải Nam", 25, 4000000, 2000000);
        Waiter waiter3 = new Waiter(3, "Nguyễn Thu Hằng", 26, 6000000, 3000000);

        // Kitchen
        Kitchen kitchen1 = new Kitchen(1, "Bùi Hiên", 25, 3000000, 3000000);
        Kitchen kitchen2 = new Kitchen(2, "Lục Thanh Ngọc", 26, 6000000, 4000000);
        Kitchen kitchen3 = new Kitchen(3, "Phạm Mẫn", 27, 9000000, 5000000);

        // Team Waiter
        List<Waiter> teamWaiter = new List<>();
        teamWaiter.addEmployee(waiter1);
        teamWaiter.addEmployee(waiter2);
        teamWaiter.addEmployee(waiter3);

        // Team Kitchen
        List<Kitchen> teamKitchen = new List<>();
        teamKitchen.addEmployee(kitchen1);
        teamKitchen.addEmployee(kitchen2);
        teamKitchen.addEmployee(kitchen3);

        System.out.println("Danh sách nhân viên Waiter");
        teamWaiter.showInfo();

        System.out.println("\nTổng lương nhân viên Waiter = " + teamWaiter.totalSalary());

        System.out.println("\nDanh sách nhân viên Kitchen");
        teamKitchen.showInfo();

        System.out.println("\nTổng lương nhân viên Kitchen = " + teamKitchen.totalSalary());
    }
}
