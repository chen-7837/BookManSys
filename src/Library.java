import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    /*引用变量保存的是对象的引用信息，它让 JVM 能找到那个对象。
    初学时可以理解成“保存对象所在内存位置（地址）”。
    引用就是一个能够让程序找到对象的“入口”或者“联系”。
    引用（reference）就是对象和变量之间的连接关系。
    引用变量保存这个连接，让程序可以找到并操作对象。
    books就是图书馆的书架，
    books 不是书架本身，它是：指向书架的一个变量（引用）。
    books是null，现在他没有对象
   */

    public Library(){
        books = new ArrayList<>();}
        //new才是真正创建了一个al，创建了书架。
        //然后books指向al，存的是al的引用，就是找到他的路径

    //1.添加书籍
    public void addBook(Book book){
        books.add(book);
        System.out.println("图书馆添加了"+book);}

    //2.展示书本信息
    public void showAllBooks(){
        for(Book book: books){
            System.out.println("Type:"+book.getBookType());
            book.showInfo();}}

    //3.搜索图书名字
    public Book searchBook(String title){
        //3.1找到了
        for (Book book: books){
            if (book.getTitle().equals(title)){
                return book;}
        }//3.2没找到的保底情况
        return null;
    }


    //4.library 管理书籍-借书
    public void borrowBook(String title){
        Book book=searchBook(title);
        if (book==null) {
            System.out.println("没有找到这本书");
        }else{
            if (book instanceof Borrowable) {
                ((Borrowable) book).borrow();
            } else{
                    System.out.println("这本书不支持当前借阅流程");
                }
            }
        }
/*
searchBook(title)
      │
      ▼
找到了书吗？
  ├── 否 → 提示没有找到
  └── 是
       │
       ▼
   instanceof Borrowable
       │
       ├── 否 → 提示不支持借阅
       └── 是 → 转成 Borrowable 引用，调用 borrow()
 */


    //5.library 管理书籍-还书
    public void returnBook(String title){
        Book book=searchBook(title);
        if (book==null){
            System.out.println("没有找到");
        }else {
            if (book instanceof Borrowable){
                ((Borrowable) book).returnBook();
            }else {
                System.out.println("找到了，但不支持当前借阅流程");
            }
        }
    }



    }

