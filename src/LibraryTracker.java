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
    public static void main(String[] args) {
    print_banner();
    System.out.println("Library Tracker initialized with books.json");
    }
}
