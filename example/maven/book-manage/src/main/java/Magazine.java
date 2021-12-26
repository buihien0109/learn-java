public class Magazine extends Book {
    private String editorialOffice;
    private String publishingDate;
    private int pageNumber;
    private int total;

    public Magazine(int id, String name, String category, String editorialOffice, String publishingDate, int pageNumber, int total) {
        super(id, name, category);
        this.editorialOffice = editorialOffice;
        this.publishingDate = publishingDate;
        this.pageNumber = pageNumber;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "editorialOffice='" + editorialOffice + '\'' +
                ", publishingDate='" + publishingDate + '\'' +
                ", pageNumber=" + pageNumber +
                ", total=" + total +
                '}';
    }
}
