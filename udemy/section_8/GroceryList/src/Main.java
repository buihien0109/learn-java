import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Tạo đối tượng scanner dùng để nhập dữ liệu
    private static Scanner scanner = new Scanner(System.in);

    // Tạo groceryList là arrayList rỗng
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        // Cho người dùng lựa chọn đến khi nào quit = true thì thoát khỏi menu
        boolean quit = false;

        // Ban đầu thì lựa chon = 0
        int choice = 0;

        // In ra menu
        printInstructions();

        // Người dùng thực hiện chọn các chức năng muốn sử dụng
        while (!quit) {
            // Lấy lựa chọn từ terminal
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    // In ra danh sách menu
    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    // Lựa chọn thêm item vào groceryList
    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    // Thay đổi giá trị của item trong groceryList
    public static void modifyItem() {
        System.out.print("Current item name: ");
        String itemNo = scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    // Xóa item trong groceryList
    public static void removeItem() {
        System.out.print("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    // Tìm kiếm item trong groceryList
    public static void searchForItem() {
        System.out.print("Item to search for: ");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem);
        } else {
            System.out.println(searchItem + ", not on file.");
        }
    }

    //
    public static void processArrayList() {
        // Tạo newArray có kiểu là ArrayList type String
        ArrayList<String> newArray = new ArrayList<String>();

        // Thêm groceryList vào cuối danh sách của newArray
        newArray.addAll(groceryList.getGroceryList());

        // Tạo nextArray có kiểu là ArrayList type String với các giá trị copy từ groceryList
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        // Tạo mảng myArray có kích thước = groceryList
        String[] myArray = new String[groceryList.getGroceryList().size()];

        // Convert từ groceryList kiểu ArrayList sang Array và gán giá trị cho biến myArray
        myArray = groceryList.getGroceryList().toArray(myArray);
    }
























}
