package com.itheima.homework.answer3;

import java.util.ArrayList;
import java.util.Scanner;

public class BookLibrarySystem {
    public static void main(String[] args) {
        ArrayList<Book> bookList = new ArrayList<>();
        start(bookList);
    }

    public static void start(ArrayList<Book> bookList) {

        System.out.println("====欢迎进入图书管理系统====");
        System.out.println("1.添加图书");
        System.out.println("2.查询所有图书");
        System.out.println("3.请输入书名，查询相关图书");
        System.out.println("4.删除图书");
        System.out.println("5.修改图书信息");
        System.out.println("6.退出系统");
        System.out.println("请输入您想执行的操作");
        Scanner sc = new Scanner(System.in);

        while (true) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    //1.添加图书
                    addBook(bookList);
                    start(bookList);
                    break;
                case 2:
                    //2.查询所有图书
                    showAllInfo(bookList);
                    start(bookList);
                    break;
                case 3:
                    //3.请输入书名，查询相关图书
                    searchBookByName(bookList);
                    start(bookList);
                    break;
                case 4:
                    //4.删除图书
                    deleteBookById(bookList);
                    start(bookList);
                    break;
                case 5:
                    //5.修改图书信息
                    changeBookInfo(bookList);
                    start(bookList);
                    break;
                case 6:
                    //6.退出系统
                    System.exit(0);
                default:
                    System.out.println("您输入的参数有误，请重新输入");
            }
        }
    }

    public static ArrayList<Book> addBook(ArrayList<Book> bookList) {
//        可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。
//        private int id;
//        private String name;
//        private String writer;
//        private int price;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入书籍的名字：");
        String bookname = sc.nextLine();
        System.out.println("请输入书籍作者的名字：");
        String writername = sc.nextLine();
        System.out.println("请输入书籍的价格：");
        String price = sc.nextLine();
        Book book = new Book(bookList.size() + 1, bookname, writername, price);
        bookList.add(book);
        System.out.println("书籍添加成功！");
        System.out.println(bookList.size());
        return bookList;
    }

    public static void showAllInfo(ArrayList<Book> bookList) {
//        可以查询图书，显示所有图书信息，然后返回到菜单。
        if (bookList.size() != 0) {
            for (Book book : bookList) {
                System.out.println("图书编号：" + book.getId());
                System.out.println("书名：" + book.getName());
                System.out.println("作者：" + book.getWriter());
                System.out.println("价格：" + book.getPrice());
            }
        } else {
            System.out.println("图书系统中没有图书，请先添加！");
            addBook(bookList);
        }
    }

    public static void searchBookByName(ArrayList<Book> bookList) {
//        可以根据书名，查询单本图书信息，显示信息后，返回到菜单。
        Scanner sc = new Scanner(System.in);
        check(bookList);
        System.out.println("请输入您想查询的书名");
        String bookname = sc.nextLine();
        for (Book book : bookList) {
            if (book.getName().equals(bookname)) {
                System.out.println("查询结果：");
                System.out.println("图书编号：" + book.getId());
                System.out.println("书名：" + book.getName());
                System.out.println("作者名：" + book.getWriter());
                System.out.println("价格：" + book.getPrice());
            } else {
                System.out.println("您输入的书名不存在");
                return;
            }
        }

    }

    public static ArrayList<Book> deleteBookById(ArrayList<Book> bookList) {
//        可以删除图书，通过编号删除，删除成功后，返回到菜单。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您想删除的图书编号");
        int bookid = sc.nextInt();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getId() == bookid) {
                bookList.remove(i);
                System.out.println("你想删除的" + bookList.get(i).getName() + "已被删除");
            }
        }
        return bookList;
    }

    public static ArrayList<Book> changeBookInfo(ArrayList<Book> bookList) {
//        可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。
        Scanner sc = new Scanner(System.in);
        check(bookList);
        System.out.println("请输入您想修改信息的图书编号");
        int bookid = sc.nextInt();
        if (bookid > 0 && bookid <= bookList.size()) {
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getId() == bookid) {
                    System.out.println("输入更改后的书名:");
                    String bookname = sc.next();
                    bookList.get(i).setName(bookname);
                    System.out.println("输入更改后的作者名:");
                    String writer = sc.next();
                    bookList.get(i).setWriter(writer);
                    System.out.println("输入更改后的书价:");
                    String price = sc.next();
                    bookList.get(i).setPrice(price);
                    System.out.println("修改成功！");
                } else {
                    System.out.println("ninsou");
                }
            }
        } else {
            System.out.println("您输入的图书id不合法。请重新输入");
            changeBookInfo(bookList);
        }
        return bookList;
    }

    public static void check(ArrayList<Book> bookList) {
        //检查书库中书数量是否为0
        if (bookList.size() == 0) {
            System.out.println("图书系统中图书数量为0，请先添加图书信息");
            addBook(bookList);
            start(bookList);
        }

    }
}
