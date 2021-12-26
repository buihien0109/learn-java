public class Newspaper extends Book {
    private String editorialOffice;
    private String publishingDate;
    private int pageNumber;
    private int total;

    public Newspaper(int id, String name, String category, String editorialOffice, String publishingDate, int pageNumber, int total) {
        super(id, name, category);
        this.editorialOffice = editorialOffice;
        this.publishingDate = publishingDate;
        this.pageNumber = pageNumber;
        this.total = total;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "editorialOffice='" + editorialOffice + '\'' +
                ", publishingDate='" + publishingDate + '\'' +
                ", pageNumber=" + pageNumber +
                ", total=" + total +
                '}';
    }
}
