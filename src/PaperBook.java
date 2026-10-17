public class PaperBook
        extends Book
        implements Borrowable
{
    private int pageCount;
    private  boolean isBorrowed =false;

    public  PaperBook(String title,String author,double price,int pageCount){
        super(title,author,price);
        this.pageCount=pageCount;}

@Override
    public void showInfo(){
        super.showInfo();
        System.out.println("pageCount"+pageCount);}

    @Override
    public String getBookType( ){
        return "paperBook";}

    @Override
    public void borrow(){
        if(isBorrowed ==true) {
            System.out.println("该书已借出");
        } else {
            System.out.println("借阅成功");
            isBorrowed =true;
        }
    }


    @Override
    public void returnBook(){
        if(isBorrowed==false){
            System.out.println("该书尚未借出，无需归还");
        }else {
            System.out.println("归还成功");
            isBorrowed=false;}
        }


}