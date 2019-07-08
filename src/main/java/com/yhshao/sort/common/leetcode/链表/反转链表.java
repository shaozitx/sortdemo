package com.yhshao.sort.common.leetcode.链表;


/**
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class 反转链表 {

    public static ListNode reverseList(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }
        ListNode targetNode = null;
        while (head != null){

            ListNode tmp = head.next;
            head.next = targetNode;
            targetNode = head;
            head = tmp;
        }
        return targetNode;
    }


    public static ListNode reverseList1(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }

        ListNode newNode = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newNode;
    }





    public static void main(String[] args) {

        TestUtil.printList(TestUtil.getList());
    }



}
