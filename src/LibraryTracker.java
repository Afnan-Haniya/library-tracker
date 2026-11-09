import java.io.IOException; import java.nio.file.Files; import java.nio.file.Paths; import java.util.List;
public class LibraryTracker {
    public static void print_banner() {
        System.out.println("========================================");
        System.out.println("   Welcome to Library Tracker v1.0      ");
        System.out.println("========================================");
    }
    public static void addBook(int id, String title, String author) {
        if (title == null || title.isEmpty()) return;
        String bookJson = String.format("{\"id\": %d, \"title\": \"%s\", \"author\": \"%s\"}",
                id, title, author);
        System.out.println("Added book to books.json: " + bookJson);
    }
    public static void listBooks() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("books.json"));
        System.out.println("--- Books List ---");
        for (String line : lines) {
            System.out.println(line);
        }     }      public static void searchBook(String keyword) {
        System.out.println("Searching books.json for title containing: " + keyword);
    }
    public static void removeBook(int id) {
        System.out.println("Removed book with ID " + id + " from books.json");
    }
    public static void main(String[] args) throws IOException {
        print_banner();
        addBook(4, "Design Patterns", "Erich Gamma");
        listBooks();
    } }
