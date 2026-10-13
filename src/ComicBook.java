public class ComicBook
extends Book
{
    private String artsist;

    public ComicBook(String title,String author,double price,String artsist){
        super(title,author,price);
        this.artsist=artsist;}

@Override
    public void showInfo(){
        super.showInfo();
    System.out.println("artsist:"+artsist);}

}
