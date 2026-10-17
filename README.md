# BookManSys — Java 图书管理系统

一个基于 Java 开发的简易图书管理系统，用于学习和实践面向对象编程、类的设计以及 Git 版本管理。

当前版本：**v2.0**

## 一、项目简介

BookManSys 是一个基于控制台运行的 Java 项目，用于管理不同类型的图书。

本项目以实际编码为导向，逐步实现图书信息管理、图书搜索、借阅与归还等功能，并通过不断迭代理解面向对象编程的设计思想。

## 二、项目功能

- **图书管理**：添加图书、展示图书信息。
- **多种图书类型**：支持纸质书、电子书和漫画书。
- **图书搜索**：根据书名查找图书。
- **借阅与归还**：支持指定类型图书的借阅和归还。
- **借阅状态管理**：记录支持借阅的图书是否已借出，避免重复借阅或无效归还。
- **多态调用**：通过统一的父类引用管理不同类型的图书。

## 三、项目结构

```text
BookManSys/
├── Book.java          # 图书抽象父类
├── PaperBook.java     # 纸质书
├── EBook.java         # 电子书
├── ComicBook.java     # 漫画书
├── Borrowable.java    # 借阅接口
├── Library.java       # 图书管理类
├── LibraryTest.java   # 程序入口与功能测试
└── README.md          # 项目说明
```

注：以上为逻辑结构示意，实际文件可能位于 IDE 项目的 `src` 目录下。

## 四、类的职责

| 类或接口 | 主要职责 |
|---|---|
| `Book` | 定义图书共有属性和行为，作为抽象父类 |
| `PaperBook` | 表示纸质书，实现借阅与归还功能 |
| `EBook` | 表示电子书，定义电子书特有信息 |
| `ComicBook` | 表示漫画书，实现借阅与归还功能 |
| `Borrowable` | 规定借阅与归还的行为契约 |
| `Library` | 保存图书，负责图书展示、搜索和借还业务 |
| `LibraryTest` | 创建测试对象，验证系统功能 |

`Library` 使用 `ArrayList<Book>` 保存图书，因此可以通过统一的 `Book` 类型管理不同的图书对象，并利用多态调用各个子类重写的方法。

## 五、涉及的 Java 知识

### 面向对象基础

- 类与对象
- 构造方法
- 封装与 `private`
- Getter / Setter
- 对象引用与对象状态

### 面向对象进阶

- 继承：`extends`
- 方法重写：`@Override`
- 抽象类与抽象方法：`abstract`
- 接口与实现：`implements`
- 多态与父类引用

### 集合与程序逻辑

- `ArrayList`
- 增强型 `for` 循环
- 方法参数与返回值
- `String.equals()` 字符串内容比较
- `instanceof` 类型判断与类型转换
- `boolean` 状态管理

### 版本管理

- Git 仓库初始化
- 暂存、提交与推送
- 使用 GitHub 保存和管理项目版本

## 六、版本迭代

### v1.0 — 基础图书管理

- 创建图书类，定义书名、作者和价格等属性。
- 实现构造方法、封装以及图书信息展示。
- 使用 `ArrayList` 保存多本图书。
- 实现图书信息遍历与基础搜索练习。
- 建立 Git 仓库并推送至 GitHub。

### v2.0 — 面向对象设计与借阅功能

- 将 `Book` 设计为抽象父类。
- 使用继承、方法重写和多态管理不同类型的图书。
- 引入 `Borrowable` 接口，规定借阅与归还行为。
- 实现纸质书和漫画书的借阅状态管理。
- 在 `Library` 中集中处理图书搜索、借阅和归还业务。

## 七、运行方式

1. 克隆或下载本项目。
2. 使用 IntelliJ IDEA 或其他 Java IDE 打开项目。
3. 配置可用的 JDK。
4. 运行 `LibraryTest`，查看程序输出并验证相关功能。

## 八、项目状态

**v2.0 已完成。**

本项目主要用于通过实践学习 Java 面向对象编程。目前已完成基础图书管理和借阅流程，后续可在新的学习阶段探索文件存储、异常处理、数据库以及其他 Java 开发技术。


-------------------------------------------------------------
# BookManSys — Java Library Management System

A simple library management system built with Java. This project was developed as a hands-on learning project to practice object-oriented programming, class design, and Git version control.

## Project Overview

BookManSys is a console-based Java project for managing different types of books. It demonstrates how to organize classes, reuse common behavior, and implement book borrowing and returning through object-oriented design.

**Current version: v2.0**

## Features

- **Book management** — Add and display books in the library.
- **Multiple book types** — Support paper books, e-books, and comic books.
- **Book search** — Search for a book by title.
- **Borrowing and returning** — Borrow and return supported physical book types.
- **Borrowing status** — Track whether a supported book has been borrowed and prevent invalid repeated operations.
- **Polymorphic behavior** — Manage different book types through a common `Book` reference.

## Project Structure

```text
BookManSys/
├── Book.java
├── PaperBook.java
├── EBook.java
├── ComicBook.java
├── Borrowable.java
├── Library.java
├── LibraryTest.java
└── README.md
```

*The exact directory layout may vary depending on the IDE project configuration.*

## Object-Oriented Design

| Class / Interface | Responsibility |
|---|---|
| `Book` | Abstract base class containing common book information and behavior |
| `PaperBook` | Represents paper books and implements borrowing and returning |
| `EBook` | Represents electronic books |
| `ComicBook` | Represents comic books and implements borrowing and returning |
| `Borrowable` | Defines the borrowing and returning contract |
| `Library` | Stores books and coordinates search, display, borrowing, and returning |
| `LibraryTest` | Entry point for running and testing the program |

The `Library` class stores books in an `ArrayList<Book>`, allowing different book types to be managed through a common parent type.

## Java Concepts Practiced

- Classes, objects, constructors, and encapsulation
- Inheritance with `extends`
- Method overriding with `@Override`
- Abstract classes and abstract methods
- Interfaces with `implements`
- Polymorphism and parent-class references
- `ArrayList` and enhanced `for` loops
- Object references and method return values
- Conditional logic and object state management

## Version History

### v1.0 — Basic Book Management

- Created the basic book model.
- Practiced constructors, encapsulation, and methods.
- Used `ArrayList` to store and display multiple books.
- Initialized Git version control and pushed the project to GitHub.

### v2.0 — Object-Oriented Design and Borrowing

- Introduced an abstract `Book` base class.
- Practiced inheritance, method overriding, and polymorphism.
- Added the `Borrowable` interface.
- Implemented borrowing and returning for supported book types.
- Added title-based search and library-level borrowing operations.

## Running the Project

1. Clone or download this repository.
2. Open the project in IntelliJ IDEA or another Java IDE.
3. Ensure a compatible JDK is configured.
4. Run `LibraryTest` to execute the example and test the implemented features.

## Project Status

**v2.0 completed.**

This project is primarily a Java learning project focused on understanding object-oriented programming through practical implementation. Future improvements may include data persistence, exception handling, and database integration.
