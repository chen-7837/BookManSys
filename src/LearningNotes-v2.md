好，我们把 BookManSys v2.0 的学习内容、项目结构、核心知识联系和 Git 工作流 汇总成一张 ASCII 思维导图。重点不是罗列代码，而是让你看清楚：这段时间学的知识是怎么组合起来解决实际问题的。

# BookManSys v2.0 学习总结

```
BookManSys 图书管理系统 v2.0
│
├── 一、项目整体结构
│   │
│   ├── Book（抽象父类）
│   │   ├── 共有属性：title / author / price
│   │   ├── 普通方法：showInfo()
│   │   └── 抽象方法：getBookType()
│   │
│   ├── PaperBook extends Book
│   │   ├── 纸质书特有属性
│   │   ├── 重写 showInfo()
│   │   ├── 实现 getBookType()
│   │   └── implements Borrowable
│   │       ├── borrow()
│   │       ├── returnBook()
│   │       └── isBorrowed（借阅状态）
│   │
│   ├── EBook extends Book
│   │   ├── 电子书特有属性
│   │   └── 实现 getBookType()
│   │
│   ├── ComicBook extends Book
│   │   ├── 漫画特有属性
│   │   ├── 实现 getBookType()
│   │   └── implements Borrowable
│   │       └── 自己的借阅状态与借还方法
│   │
│   ├── Borrowable（接口）
│   │   ├── borrow()
│   │   └── returnBook()
│   │
│   ├── Library（业务管理类）
│   │   ├── ArrayList<Book> books
│   │   ├── addBook(Book book)
│   │   ├── showAllBooks()
│   │   ├── searchBook(String title)
│   │   ├── borrowBook(String title)
│   │   └── returnBook(String title)
│   │
│   └── LibraryTest（测试入口）
│       ├── 创建 Library
│       ├── 添加不同类型的书
│       ├── 测试展示、搜索
│       └── 测试借书、还书、异常业务情况
│
├── 二、面向对象核心知识
│   │
│   ├── 1. 封装
│   │   ├── 属性使用 private
│   │   └── 通过方法控制对象状态
│   │
│   ├── 2. 继承 extends
│   │   ├── 子类复用父类共有属性和方法
│   │   ├── super(...) 调用父类构造方法
│   │   └── @Override 重写父类方法
│   │
│   ├── 3. 抽象类 abstract
│   │   ├── Book 不能直接 new
│   │   ├── 可以有构造方法、普通方法
│   │   └── 抽象方法规定子类必须实现的行为
│   │
│   ├── 4. 多态
│   │   ├── ArrayList<Book> 保存不同子类对象
│   │   ├── Book 引用调用 showInfo()
│   │   └── 实际对象决定运行哪个重写版本
│   │
│   └── 5. 接口 implements
│       ├── Borrowable 定义借还能力
│       ├── PaperBook / ComicBook 实现接口
│       └── EBook 在当前业务规则下不实现该接口
│
├── 三、项目中真正用到的设计思路
│   │
│   ├── 共有的内容 → 放在父类
│   ├── 子类各自不同的内容 → 子类重写 / 实现
│   ├── 可选的能力 → 接口
│   ├── 多本书统一管理 → ArrayList<Book>
│   ├── 根据书名查找 → 返回 Book 对象或 null
│   ├── 借还书 → 找到对象，再调用对应行为
│   └── 管理职责 → 放在 Library，而非全部塞进 Test
│
└── 四、Git 版本管理
    │
    ├── git status
    │   └── 检查当前工作区状态
    │
    ├── git add .
    │   └── 把修改放入暂存区
    │
    ├── git commit -m "提交说明"
    │   └── 创建本地版本记录
    │
    ├── git push origin 分支名
    │   └── 把本地提交推送到 GitHub
    │
    └── git status
        └── 检查是否还有未提交的修改
```

## 最值得记住的 4 个知识联系

1\. 抽象类 + 继承 + 多态

```
Book
 ├── PaperBook
 ├── EBook
 └── ComicBook
         ↓
ArrayList<Book>
         ↓
book.showInfo()
         ↓
执行实际对象对应的版本
```

解决的问题：不同类型的书可以统一管理，又能保留各自的行为。

2\. 接口 + 多态思想

```
Borrowable
   ├── borrow()
   └── returnBook()
         ↑
   ┌─────┴─────┐
PaperBook  ComicBook
```

解决的问题：不同类可以具备相同能力，而不必因为这项能力再建立继承关系。

3\. 引用 + 对象 + 封装

```
Library
   ↓
ArrayList<Book>
   ↓
保存书籍对象的引用
   ↓
找到对象 → 调用借还方法
   ↓
对象内部的 isBorrowed 改变
```

解决的问题：管理类不必亲自修改每本书的内部状态，只需要调用它提供的方法。

4\. 项目职责划分

```
Book 系列：描述书籍
     ↓
Borrowable：规定借还能力
     ↓
Library：组织业务流程
     ↓
LibraryTest：测试运行结果
```

解决的问题：避免所有代码都堆在 main 方法里，让每个类负责相对明确的事情。

## v1.0 → v2.0：你实际进步在哪里？

| 阶段   | 主要能力                             |
| ---- | -------------------------------- |
| v1.0 | 类与对象、封装、构造方法、ArrayList、基本 Git 流程 |
| v2.0 | 继承、重写、多态、抽象类、接口、对象状态管理、类的职责划分    |

你现在已经不只是会写单个类，而是在练习让多个类按照明确的职责协作完成业务。

## 本次项目收尾

如果第二次 `git push` 已经成功，BookManSys v2.0 就可以暂时结束，不必继续追加功能。

```
BookManSys v2.0
      ↓
代码运行正常
      ↓
Git commit 完成
      ↓
Git push 成功
      ↓
本阶段结束 ✓
```

下一阶段学习时，不需要立刻另起一个庞大项目。可以先复习这张图，之后再通过新任务自然引入 `HashMap`、异常处理、文件 IO、数据库等知识。

学习原则仍然是：先遇到实际问题，再学习解决这个问题所需的知识。