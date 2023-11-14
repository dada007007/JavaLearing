package com.itheima.homework2.answer1;
/*
请定义一个Collection类型的集合，存储以下字符串：
“JavaEE企业级开发指南”，”Oracle高级编程”，”MySQL从入门到精通”，”Java架构师之路”
**要求:**
请编程实现以下功能：
使用迭代器遍历所有元素，并打印
使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
(注意：以上每个功能都单独写个方法，在main方法中逐个调用测试即可)
*/
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Collection<String> book = new ArrayList<>();
        book.add("JavaEE企业级开发指南");
        book.add("Oracle高级编程");
        book.add("MySQL从入门到精通");
        book.add("Java架构师之路");
//        showAll(book);
//        showName(book);
//        select(book);
        contains_Oracle(book);
    }

    public static void showAll(Collection<String> book) {
        //使用迭代器遍历所有元素，并打印
        Iterator<String> it = book.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void showName(Collection<String> book) {
        //使用迭代器遍历所有元素，筛选书名小于10个字符的，并打印；
        Iterator<String> it = book.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.length() < 10) {
                System.out.println(next);
            }
        }
    }

    public static void select(Collection<String> book) {
//        使用迭代器遍历所有元素，筛选书名中包含“Java”的，并打印
        Iterator<String> it = book.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (next.contains("Java")) {
                System.out.println(next);
            }
        }
    }

    public static void contains_Oracle(Collection<String> book) {
        //如果书名中包含“Oracle”，则删掉此书。删掉后，遍历集合，打印所有书名。
        book.removeIf(next -> next.contains("Oracle"));
        for (String next : book) {
            System.out.println(next);
        }
    }
}
