import java.util.ArrayList;

public class main {
    void main(String[] args) {
        Book bookA = new Book("Java核心技术", "Cay Horstmann", 99.0);
        Book bookB = new Book("三体", "刘慈欣", 59.9);
        //bookA.showInfo();bookB.showInfo();
        //1.ArrayList：同类型数组，add（）,get(),size()   解决：很多本书怎么保存？
        ArrayList<Book> books = new ArrayList<>();
        books.add(bookA);
        books.add(bookB);
        //2.循环打印books ArrayList的书本信息
        for (int i = 0; i < books.size(); i++) {
            //System.out.println(books.get(i).showInfo()};
            //showInfo返回类型void，自己打印没返回值，所以不能放进sout
            books.get(i).showInfo();
        }
        System.out.println(bookB.getTitle());
        //3.String 的比较方法 equals()             a.equals(b)   判断两个字符串内容是否一样。 T or F
        System.out.println(bookB.getTitle().equals("三体"));
        //根据书名找书
        String searchName = "三体";
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equals(searchName)) {
                System.out.println(searchName + "找到了");
                break;
            }
        }
        //4.setPrice测试
        bookB.setPrice(-1);
        bookB.setPrice(20);
        bookB.showInfo();

        //5.getPrice测试
        System.out.println("b的价格是" + bookB.getPrice());
    }
}