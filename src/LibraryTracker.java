import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
public class LibraryTracker {
    public static void print_banner() {
        System.out.println("========================================");
        System.out.println("   Welcome to Library Tracker v1.0      ");
        System.out.println("========================================");
    }
    public static void addBook(int id, String title, String author) {
        String bookJson = String.format("{\"id\": %d, \"title\": \"%s\", \"author\": \"%s\"}",
                id, title, author);
        System.out.println("Added book to books.json: " + bookJson);
    }
    public static void main(String[] args) {
        print_banner();
        addBook(4, "Design Patterns", "Erich Gamma");
    }
}