package com.itheima.d4_list;

/**
 * 手写双链表。(拓展内容)
 */
public class MyLinkedList<E> {

    private int size; // 元素个数
    private Node<E> first;
    private Node<E> last;

    public boolean add(E e){
        Node<E> l = last;
        // 开始新增一个结点对象封装这个数据，加入到双链表中去。
        Node<E> newNode = new Node<>(e, l, null);
        last = newNode;
        if(l == null){
            // 这是第一次添加结点。
            first = newNode;
        }else {
            // 不是第一次添加结点，让添加前的最后一个结点的下一个地址，指向新结点，。
            l.next = newNode;
        }
        size++;
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        // 先把头结点地址交给一个临时变量
        Node<E> head = first;
        while (head != null) {
            sb.append(head.item).append(head.next == null ? "" : ", ");
            // 把head结点轮到下一个结点。
            head = head.next;
        }
        sb.append("]");
        return sb.toString();
    }

    private static class Node<E>{
        E item;
        Node<E> pre; // 上个结点地址
        Node<E> next;

        public Node(E item, Node<E> pre, Node<E> next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }
    }
}

