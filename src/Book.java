import java.util.PrimitiveIterator;

public abstract class Book {
    /*
    abstract 限制的是直接实例化，并没有禁止子类继承父类、调用父类构造方法。
    抽象类： 不能直接创建它的对象，但可以作为其他类的父类。
    抽象方法： 只规定方法必须存在，不提供具体实现；普通的具体子类必须实现它。
     */
    private String title;
    private String author;
    private double price;

    public Book(){};
    public Book(String title,String author,double price){
        this.price=price;
        this.author=author;
        this.title=title;};

    /*
    抽象方法：没有方法体
    所有子类都需要的行为，可以在父类中规定；如果父类无法提供统一的具体实现，就可以把它声明为抽象方法。
     */
    public abstract String getBookType();

    //具体方法：有方法体
    public void setPrice(double price) {
        this.price = price;}

    public double getPrice(){
        return price;}

    public  String getTitle(){
        return title;}

public void showInfo(){
    System.out.println("title:"+title);
    System.out.println("author:"+author);
    System.out.println("price:"+price);}
}
