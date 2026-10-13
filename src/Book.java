import java.util.PrimitiveIterator;

public class Book {
    private String title;
    private String author;
    private double price;

    public Book(){};
    public Book(String title,String author,double price){
        this.price=price;
        this.author=author;
        this.title=title;};


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
