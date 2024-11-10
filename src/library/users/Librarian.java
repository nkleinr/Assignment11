package library.users;

public class Librarian extends User {
    public Librarian(String name, int id) {
        super(name, id);
    }

    public Librarian() {
        super();
    }

    @Override
    public void accessLibrary() {
        System.out.println("Librarian managing the library.");
    }

    public void addMaterial() {
        System.out.println("Material added to the library.");
    }
}
