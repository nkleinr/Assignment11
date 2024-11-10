package library;

import library.materials.Book;
import library.materials.DVD;
import library.users.Librarian;
import library.users.Member;
import library.utilities.Logger;

public class LibrarySystem {
    public static void main(String[] args) {
        // Welcome Message
        Logger.log("Welcome to the Library Management System!");

        // Create Library
        OnlineLibrary onlineLibrary = new OnlineLibrary("Central Library", "Downtown", "http://centrallibrary.com");
        onlineLibrary.displayLibraryDetails();

        // Create Books and DVDs
        Book book = new Book("Java Programming", "TechPress", "John Doe");
        DVD dvd = new DVD("Introduction to Java", "TechStudio", 120.5);

        // Borrow Materials
        book.borrow();
        dvd.borrow();

        // Create Users
        Librarian librarian = new Librarian("Alice", 1001);
        Member member = new Member("Bob", 1002, "Premium");

        // User Interactions
        librarian.accessLibrary();
        librarian.addMaterial();

        member.accessLibrary();
        System.out.println("Membership Type: " + member.getMembershipType());

        // Searching and Notifications
        onlineLibrary.search("Java Programming");
        onlineLibrary.notifyUser("Your book is due tomorrow!");

        // Farewell Message
        Logger.log("Thank you for using the Library Management System!");
    }
}
