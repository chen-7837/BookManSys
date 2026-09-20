我说说我对get的理解，就是不能直接通过变量属性的方式获取数据，而是通过方法获取。
今天的学习内容：
## 1. get 的本质是什么？
你的理解：不能直接通过变量属性的方式获取数据，而是通过方法获取。
比如：

```java
private String title;
```

因为：
```java
private
```

所以外部不能：

```java
book.title
```

直接拿。

于是我们提供：

```java
public String getTitle(){
    return title;
}
```

外部：

```java
System.out.println(book.getTitle());
```

流程：

```text
外部对象
  |
  | 调用方法
  ↓
getTitle()
  |
  | return
  ↓
title属性的数据
```

所以：

> getter 就是给外部提供“读取数据的通道”。

---

## 2. 那 this 到底是什么？

这个东西很多人学了忘，很正常。

你只需要记一句：

> **this 表示当前这个对象自己。**

比如：

```java
public class Book {

    private String title;

}
```

假设：

```java
Book bookA = new Book();
```

那么：

```text
bookA
↓
就是一个对象
↓
里面有自己的title
```

在类里面：

```java
this.title
```

意思就是：

> 当前这个对象自己的 title。

---

## 3. 为什么需要 this？

看你的构造方法：

```java
public Book(String title){
    this.title = title;
}
```

这里有两个 title：

左边：

```java
this.title
```

右边：

```java
title
```

它们不是一个东西。

右边：

```java
title
```

是参数：

```java
new Book("三体")
```

传进来的：

```text
"三体"
```

左边：

```java
this.title
```

是对象里面的属性：

```java
private String title;
```

所以：

```java
this.title = title;
```

翻译成人话：

> 把传进来的书名，保存到当前这本书自己的书名属性里。

---

## 4. 如果不用 this 会怎么样？

比如你写：

```java
public Book(String title){
    title = title;
}
```

Java 会认为：

左边：

```java
title
```

是参数。

右边：

```java
title
```

也是参数。

结果：

```text
参数 = 参数
```

等于什么都没做。

你的对象属性：

```java
private String title;
```

还是空的。

所以必须告诉 Java：

```java
this.title
```

这是对象属性。

---

## 5. 用你的图书项目理解

假设：

```java
Book bookA = new Book("三体","刘慈欣",59.9);
```

进入构造方法：

```java
public Book(String title,String author,double price){

}
```

参数：

```text
title = "三体"
author = "刘慈欣"
price = 59.9
```

执行：

```java
this.title = title;
this.author = author;
this.price = price;
```

之后：

```text
bookA对象

title
 ↓
"三体"

author
 ↓
"刘慈欣"

price
 ↓
59.9
```

---

所以你现在可以把这几个东西串起来：

```text
private属性
    ↓
不让外部随便访问

getter
    ↓
提供读取入口

setter
    ↓
提供修改入口

this
    ↓
区分对象自己的属性和传入参数
```

其实你现在已经重新掌握了 **Java 面向对象最核心的一套东西**。

下一步我们继续做图书系统：
让查找到的书可以修改价格、查看价格。这里会补最后一个 getter：`getPrice()`。你会发现它和 `getTitle()` 是一模一样的套路。
