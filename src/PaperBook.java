public class PaperBook
extends Book
{
    private int pageCount;
    public  PaperBook(String title,String author,double price,int pageCount){
        super(title,author,price);
        this.pageCount=pageCount;}

@Override
    public void showInfo(){
        super.showInfo();
        System.out.println("pageCount"+pageCount);}
}
