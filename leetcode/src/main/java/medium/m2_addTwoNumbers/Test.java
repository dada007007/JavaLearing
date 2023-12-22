package medium.m2_addTwoNumbers;


public class Test {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        System.out.println(l1);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);
        l2.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next = new ListNode(9);
        l2.next.next.next.next.next.next.next.next= new ListNode(9);
        l2.next.next.next.next.next.next.next.next.next = new ListNode(9);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        addTwoNumbers.addTwoNumbers(l1, l2);
    }
}
