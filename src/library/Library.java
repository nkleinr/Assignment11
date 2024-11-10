package library;

import library.utilities.Logger;

public abstract class Library {
    private String name;
    private String location;

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
        Logger.log("Library initialized: " + name + ", " + location);
    }

    public Library() {
        this("Default Library", "Unknown");
        Logger.log("Default Library instance created.");
    }

    public abstract void displayLibraryDetails();

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
