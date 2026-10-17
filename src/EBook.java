public class EBook
extends Book
{
    private double fileSize;
    public EBook(String title,String author,double price,double fileSize){
        super(title,author,price);
        this.fileSize=fileSize;}

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("fileSize:"+fileSize+"MB");}

    @Override
    public String getBookType( ){
        return "EBook";}
}
