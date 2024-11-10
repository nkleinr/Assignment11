package library.users;

public abstract class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public User() {
        this("Guest", 0);
    }

    public abstract void accessLibrary();

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
