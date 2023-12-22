package medium.m2_addTwoNumbers;

/* 两数相加
给你两个 非空 的链表，表示两个非负的整数。
它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
请你将两个数相加，并以相同形式返回一个表示和的链表。
你可以假设除了数字 0 之外，这两个数都不会以 0 开头
*/
//失败原因：节点内部数据太多，组成的数字太长，超出long范围限制
public class AddTwoNumbers_failure {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long num1 = getNextValue(l1);
        System.out.println(num1);
        long num2 = getNextValue(l2);
        System.out.println(num2);
        if (num1 == 0 && num2 == 0) {
            return new ListNode(0);
        }
        long num3 = num1 + num2;
        System.out.println(num3);
        return convertToList(num3);
    }

    public static ListNode convertToList(long num) {
        if (num == 0) {
            return null;
        }
        ListNode head = new ListNode((int) (num % 10));
        head.next = convertToList(num / 10);
        return head;
    }

    public long getNextValue(ListNode head) {
        if (head == null) {
            return 0;
        } else {
            Long i = head.val + getNextValue(head.next) * 10;
            System.out.println(i);
            return i;
        }
    }
}

