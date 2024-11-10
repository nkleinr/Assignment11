package library.materials;

public abstract class Material {
    private String title;
    private String publisher;

    public Material(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    public Material() {
        this("Unknown Title", "Unknown Publisher");
    }

    public abstract void borrow();

    public String getTitle() {
        return title;
    }

    public String getPublisher() {
        return publisher;
    }
}
