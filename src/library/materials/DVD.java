package library.materials;

public class DVD extends Material {
    private double duration;

    public DVD(String title, String publisher, double duration) {
        super(title, publisher);
        this.duration = duration;
    }

    public DVD() {
        super();
        this.duration = 0.0;
    }

    @Override
    public void borrow() {
        System.out.println("Borrowing a DVD: " + getTitle());
    }

    public double getDuration() {
        return duration;
    }
}
