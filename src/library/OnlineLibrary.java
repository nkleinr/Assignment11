package library;

import library.utilities.Notifiable;
import library.utilities.Searchable;

public class OnlineLibrary extends Library implements Searchable, Notifiable {
    private String url;

    public OnlineLibrary(String name, String location, String url) {
        super(name, location);
        this.url = url;
    }

    public OnlineLibrary() {
        super();
        this.url = "http://defaultlibrary.com";
    }

    @Override
    public void displayLibraryDetails() {
        System.out.println("Online Library: " + getName() + " - " + url);
    }

    @Override
    public void search(String query) {
        System.out.println("Searching for: " + query);
    }

    @Override
    public void notifyUser(String message) {
        System.out.println("Notification: " + message);
    }
}
