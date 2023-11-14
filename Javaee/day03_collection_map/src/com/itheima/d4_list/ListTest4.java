package com.itheima.d4_list;

import java.util.LinkedList;

public class ListTest4 {
    public static void main(String[] args) {
        // 目标：掌握LinkedList的应用
        // 1、使用LinkedList做队列。
        LinkedList<String> queue = new LinkedList<>();
        // 入队
        queue.addLast("第1个人");
        queue.addLast("第2个人");
        queue.addLast("第3个人");
        queue.addLast("第4个人");
        System.out.println(queue);

        // 出队
        System.out.println(queue.removeFirst());
        System.out.println(queue.removeFirst());
        System.out.println(queue);

        System.out.println("----------------------------------------------------");

        LinkedList<String> stack = new LinkedList<>();
        // 入栈
        stack.push("第1个子弹");
        stack.push("第2个子弹");
        stack.push("第3个子弹");
        stack.push("第4个子弹");
        System.out.println(stack);
        // 出栈
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println("----------------------------------------------------");

        MyLinkedList<String> linked = new MyLinkedList<>();
        linked.add("java1");
        linked.add("java2");
        linked.add("java3");
        System.out.println(linked);
    }
}
