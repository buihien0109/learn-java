public class TextBook extends Book {
    private String author;
    private int publishingYear;
    private String publishingCompany;
    private int pageNumber;
    private int total;

    public TextBook(int id, String name, String category, String author, int publishingYear, String publishingCompany, int pageNumber, int total) {
        super(id, name, category);
        this.author = author;
        this.publishingYear = publishingYear;
        this.publishingCompany = publishingCompany;
        this.pageNumber = pageNumber;
        this.total = total;
    }

    @Override
    public String toString() {
        return "TextBook{" +
                "author='" + author + '\'' +
                ", publishingYear=" + publishingYear +
                ", publishingCompany='" + publishingCompany + '\'' +
                ", pageNumber=" + pageNumber +
                ", total=" + total +
                '}';
    }
}
