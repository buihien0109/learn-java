import java.util.Scanner;

public class Store {
    private Product[] products;
    private Scanner scanner = new Scanner(System.in);

    public void input() {
        System.out.print("1. Nhập vào số lượng sản phẩm : ");
        int number = Integer.parseInt(scanner.nextLine());
        products = new Product[number];

        System.out.println("2. Nhập vào thông tin sản phẩm");
        for (int i = 0; i < products.length; i++) {
            System.out.println("Nhập vào thông tin sản phẩm " + (i + 1));
            System.out.print("Mã sản phẩm : ");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.print("Tên sản phẩm : ");
            String name = scanner.nextLine();

            System.out.print("Mô tả sản phẩm : ");
            String description = scanner.nextLine();

            System.out.print("Số lượng sản phẩm : ");
            int total = Integer.parseInt(scanner.nextLine());

            System.out.print("Giá bán sản phẩm : ");
            int price = Integer.parseInt(scanner.nextLine());

            System.out.print("Loại sản phẩm : ");
            String category = scanner.nextLine();

            products[i] = new Product(id, name, description, total, price, category);
        }
    }

    public void print() {
        System.out.println("3. In ra thông tin sản phẩm");
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    public void findProductByName() {
        System.out.println("4. Tìm kiếm sản phẩm theo tên");
        System.out.print("Nhập vào tên sản phẩm muốn tìm kiếm : ");
        String productName = scanner.nextLine();

        boolean isFind = false;
        for (int i = 0; i < products.length; i++) {
            if(products[i].getName().contains(productName)) {
                System.out.println(products[i]);
                isFind = true;
            }
        }

        if (!isFind) {
            System.out.println("Không tìm thấy sản phẩm");
        }
    }
}
