import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private  double price;

    //1、构造方法
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    //2、showInfo打印书信息
    public void showInfo(){
        System.out.println("书名："+title);
        System.out.println("作者："+author);
        System.out.println("价格："+price);
    }
    //3、getTitle
    public String getTitle(){
        return title;
    }
    //4.修改price setPrice
    public void setPrice(double price){
        if(price>0) {
            this.price=price;
        }
        else System.out.println("请输入正确的价格");
    }
    //5.getPrice
    public double getPrice(){
        return price;
    }
}