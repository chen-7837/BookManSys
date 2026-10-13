import java.util.ArrayList;

public class LibraryTest {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new PaperBook("纸质书", "ming1", 1, 1));
        books.add(new EBook("电子书", "ming2", 2, 2.0));
        books.add(new ComicBook("漫画书", "ming3", 3, "ming3"));

        for (Book book1 : books) {
            book1.showInfo();}


    }
}
