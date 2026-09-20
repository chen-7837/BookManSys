我说说我对get的理解，就是不能直接通过变量属性的方式获取数据，而是通过方法获取。
今天的学习内容：

今天我们其实完成了**图书管理系统第一阶段 MVP（最小可运行版本）**，而且不是单纯敲代码，而是把 Java 面向对象的核心思想重新串起来了。

下面我帮你整理：

1. 今天学了什么
2. 当前项目代码结构
3. 核心知识点总结
4. Git 提交建议
5. 明天学习计划

---

# 一、今天完成的项目功能

## 图书管理系统 v1.0

目前支持：

✅ 创建图书
✅ 保存多本图书
✅ 展示图书信息
✅ 根据书名查找图书
✅ 修改图书价格
✅ 获取图书属性

目前结构：

```
BookSystem
│
├── Book.java
│
└── Main.java
```

---

# 二、Book.java 当前代码

大概应该是：

```java
public class Book {

    private String title;
    private String author;
    private double price;


    // 构造方法
    public Book(String title, String author, double price) {

        this.title = title;
        this.author = author;
        this.price = price;

    }


    // 展示书籍信息
    public void showInfo(){

        System.out.println("书名：" + title);
        System.out.println("作者：" + author);
        System.out.println("价格：" + price);

    }


    // 获取书名
    public String getTitle(){

        return title;

    }


    // 获取价格
    public double getPrice(){

        return price;

    }


    // 修改价格
    public void setPrice(double price){

        if(price > 0){

            this.price = price;

        }

    }

}
```

---

# 三、Main.java 当前代码逻辑

类似：

```java
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {


        Book bookA =
                new Book("Java核心技术",
                        "Cay Horstmann",
                        99.0);


        Book bookB =
                new Book("三体",
                        "刘慈欣",
                        59.9);



        ArrayList<Book> books = new ArrayList<>();


        books.add(bookA);
        books.add(bookB);



        // 遍历所有书

        for(int i = 0; i < books.size(); i++){

            books.get(i).showInfo();

        }



        // 查找图书

        String searchName = "三体";


        for(int i = 0; i < books.size(); i++){

            if(books.get(i)
                    .getTitle()
                    .equals(searchName)){


                System.out.println(searchName+"找到了");


            }

        }



        // 修改价格

        bookB.setPrice(69.9);


        System.out.println(bookB.getPrice());


    }

}
```

---

# 四、今天真正掌握的 Java 知识

## 1. 类和对象

类：

```java
Book
```

是模板。

对象：

```java
bookA
bookB
```

是真实存在的数据。

关系：

```
Book类
 ↓
new
 ↓
Book对象
```

---

# 2. 构造方法

作用：

> 创建对象时初始化数据。

例如：

```java
new Book(
"三体",
"刘慈欣",
59.9
)
```

进入：

```java
public Book(...)
```

---

# 3. this

核心：

> 当前对象自己。

例如：

```java
this.price = price;
```

左边：

```
this.price
↓
对象自己的属性
```

右边：

```
price
↓
传进来的参数
```

---

# 4. 封装

核心：

不要直接暴露数据。

以前：

```java
book.price
```

不允许。

现在：

读取：

```java
book.getPrice()
```

修改：

```java
book.setPrice()
```

思想：

```
private属性

↓

方法控制访问

↓

保护对象数据
```

---

# 5. Getter

作用：

获取数据。

格式：

```java
public 类型 getXXX(){

    return xxx;

}
```

例如：

```java
public String getTitle(){

    return title;

}
```

---

# 6. Setter

作用：

修改数据。

格式：

```java
public void setXXX(类型 xxx){

    this.xxx = xxx;

}
```

今天你还加入了简单的数据校验：

```java
if(price>0)
```

这是非常好的习惯。

---

# 7. ArrayList

解决：

> 很多对象怎么保存？

例如：

```java
ArrayList<Book> books;
```

三个核心方法：

## 添加

```java
books.add(book);
```

## 获取

```java
books.get(i);
```

## 数量

```java
books.size();
```

---

# 8. String比较

错误：

```java
==
```

正确：

```java
equals()
```

例如：

```java
book.getTitle().equals(searchName)
```

---

# 五、今天最重要的思维变化

以前：

```
学一个知识点
↓
背语法
```

今天：

```
项目需求
↓
遇到问题
↓
引入知识
↓
解决问题
```

例如：

为什么学 ArrayList？

不是因为教材说：

> 今天学习 ArrayList。

而是：

> 两本书还能写变量，100本怎么办？

所以需要：

ArrayList。

为什么学 getter？

不是因为：

> 今天学习 getter。

而是：

> private属性外部访问不了怎么办？

所以需要：

getter。

这就是项目驱动。

---

# 六、Git 提交建议

今天这个节点非常适合第一次提交。

建议 commit：

```
feat: complete basic book management system
```

意思：

> 新增：完成基础图书管理系统

提交内容：

```
Book.java
Main.java
```

---

Git流程：

查看：

```bash
git status
```

添加：

```bash
git add .
```

提交：

```bash
git commit -m "feat: complete basic book management system"
```

推送：

```bash
git push
```

---

# 七、明天学习计划

明天不要直接学一堆继承语法。

顺序：

## 第一部分：完善当前系统

增加：

* getAuthor()
* 修改书名
* 删除图书

会引入：

* 更多 getter/setter
* ArrayList 更多操作

---

## 第二部分：进入继承

从问题开始：

现在：

```
Book
```

太普通。

增加：

```
PaperBook
EBook
AudioBook
```

学习：

1. 为什么需要继承
2. extends
3. 父类和子类
4. 方法重写

---

## 第三部分：

多态：

解决：

```java
ArrayList<Book>
```

里面放：

```
PaperBook
EBook
AudioBook
```

然后统一调用：

```java
showInfo()
```

这会是 Java 面向对象最核心的一关。

---

最后评价一下今天的进度：

你不是“学了几个 API”。

你实际上完成了：

> 从写单个类 → 管理对象集合 → 操作对象 → 开始设计对象关系

这是 Java 入门最关键的一条线。

现在可以放心提交 Git。明天从继承继续。你今天这个节点提交一个版本非常合适。
