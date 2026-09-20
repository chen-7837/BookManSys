我说说我对get的理解，就是不能直接通过变量属性的方式获取数据，而是通过方法获取。
今天的学习内容：
四、今天真正掌握的 Java 知识
1. 类和对象

类：

Book

是模板。

对象：

bookA
bookB

是真实存在的数据。

关系：

Book类
 ↓
new
 ↓
Book对象
2. 构造方法

作用：

创建对象时初始化数据。

例如：

new Book(
"三体",
"刘慈欣",
59.9
)

进入：

public Book(...)
3. this

核心：

当前对象自己。

例如：

this.price = price;

左边：

this.price
↓
对象自己的属性

右边：

price
↓
传进来的参数
4. 封装

核心：

不要直接暴露数据。

以前：

book.price

不允许。

现在：

读取：

book.getPrice()

修改：

book.setPrice()

思想：

private属性

↓

方法控制访问

↓

保护对象数据
5. Getter

作用：

获取数据。

格式：

public 类型 getXXX(){

    return xxx;

}

例如：

public String getTitle(){

    return title;

}
6. Setter

作用：

修改数据。

格式：

public void setXXX(类型 xxx){

    this.xxx = xxx;

}

今天你还加入了简单的数据校验：

if(price>0)

这是非常好的习惯。

7. ArrayList

解决：

很多对象怎么保存？

例如：

ArrayList<Book> books;

三个核心方法：

添加
books.add(book);
获取
books.get(i);
数量
books.size();
8. String比较

错误：

==

正确：

equals()

例如：

book.getTitle().equals(searchName)
