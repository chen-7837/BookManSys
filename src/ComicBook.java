public class ComicBook
    extends Book
    implements Borrowable
{
    private String artist;
    private  boolean isBorrowed =false;

    public ComicBook(String title,String author,double price,String artsist){
        super(title,author,price);
        this.artist=artist;}


@Override
    public void showInfo(){
        super.showInfo();
    System.out.println("artsist:"+artist);}


    @Override
    public String getBookType( ){
        return "ComicBook";}


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
