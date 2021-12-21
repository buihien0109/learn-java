import java.util.ArrayList;

public class GroceryList {
    // Tạo biến groceryList kiểu ArrayList
    private ArrayList<String> groceryList = new ArrayList<String>();

    // Thêm item vào groceryList
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // Trả về groceryList
    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    // In groceryList trong terminal
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // Thay đổi giá trị của phần tử trong groceryList
    // Tham số đầu vào : currentItem, newItem
    public void modifyGroceryItem(String currentItem, String newItem) {
        // Tìm vị trí của phần tử
        int position = findItem(currentItem);

        // Nếu tìm thấy thì thay đổi giá trị dựa vào vị trí
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    // Thay đổi giá trị của phần tử trong groceryList
    // Tham số đầu vào : position, newItem
    private void modifyGroceryItem(int position, String newItem) {
        // Thay đổi giá trị của phần tự tại vị trí "position" sang value khác
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    // Xóa một giá trị ra khỏi groceryList
    public void removeGroceryItem(String item) {
        // Tìm kiếm vị trí của giá trị đó trong groceryList
        int position = findItem(item);

        // Thực hiện xóa theo vị trí đã tìm được
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    // Xóa 1 giá trị ra khỏi groceryList dựa vào vị trí
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    // Tìm kiếm vị trí của 1 giá trị bất kỳ trong groceryList
    // Trả về vị trí của giá trị đó, nếu không có thì trả về  -1
    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    // Tìm kiếm vị trí của 1 giá trị bất kỳ trong groceryList
    // Nếu tìm thấy -> true
    // Nếu không tìm thấy  -> return false
    public boolean onFile(String searchItem) {
        // Tìm kiếm vị trí của phần tử trong groceryList
        int position = findItem(searchItem);

        // Tìm thấy -> true
        if (position >= 0) {
            return true;
        }
        // Không tìm thấy -> false
        return false;
    }
}
