public class ElectronicDocument extends Book {
    private String author;
    private int publishingYear;
    private String uploadDate; // ngày upload
    private int capacity; // dung lượng
    private int downloads; // lượt tải

    public ElectronicDocument(int id, String name, String category, String author, int publishingYear, String uploadDate, int capacity, int downloads) {
        super(id, name, category);
        this.author = author;
        this.publishingYear = publishingYear;
        this.uploadDate = uploadDate;
        this.capacity = capacity;
        this.downloads = downloads;
    }

    @Override
    public String toString() {
        return "ElectronicDocument{" +
                "author='" + author + '\'' +
                ", publishingYear=" + publishingYear +
                ", uploadDate='" + uploadDate + '\'' +
                ", capacity=" + capacity +
                ", downloads=" + downloads +
                '}';
    }
}
