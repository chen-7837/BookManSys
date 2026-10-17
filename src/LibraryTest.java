import java.util.ArrayList;

public class LibraryTest {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new PaperBook("纸质书", "ming1", 1, 1));
        library.addBook(new EBook("电子书", "ming2", 2, 2.0));
        library.addBook(new ComicBook("漫画书", "ming3", 3, "ming3"));
        library.showAllBooks();

        /*
        声明接口 → 实现接口 → 创建对象并调用方法。
        实现接口决定能否赋值；eg:Borrowable pb = new PaperBook(...);不行，paperBook没br接口
        引用类型决定编译时能调用哪些方法；
        实际对象决定运行时执行哪个重写版本。
         */
        Borrowable pb = new PaperBook("西游记", "吴承恩", 18.8, 300);
        library.addBook((Book)pb);
        pb.returnBook();
        pb.borrow();
        pb.returnBook();
        pb.borrow();
        pb.returnBook();
        System.out.println("------------------------------------------");

        System.out.println("1.测试library借书还书方法");
        library.borrowBook("西游记");
        library.borrowBook("西游记");
        library.returnBook("西游记");
        library.returnBook("西游记");
        library.borrowBook("不存在的书");
        System.out.println("------------------------------------------");

        System.out.println("2.目前的借阅状态逻辑是在 PaperBook 里实现的");
        System.out.println("所以要确认漫画书也能正常借阅和归还");
        library.borrowBook("漫画书");
        library.returnBook("漫画书");


    }
}
