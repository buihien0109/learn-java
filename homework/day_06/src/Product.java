public class Product {
    private int id;
    private String name;
    private String description;
    private int total;
    private int price;
    private String category;

    public Product() {
    }

    public Product(int id, String name, String description, int total, int price, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.total = total;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", total=" + total +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }
}
