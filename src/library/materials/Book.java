package library.materials;

public class Book extends Material {
    private String author;

    public Book(String title, String publisher, String author) {
        super(title, publisher);
        this.author = author;
    }

    public Book() {
        super();
        this.author = "Unknown Author";
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing a book: " + getTitle());
    }

    public String getAuthor() {
        return author;
    }
}
