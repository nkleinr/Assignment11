package library.utilities;

public final class Logger {
    private Logger() {}

    public static void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
