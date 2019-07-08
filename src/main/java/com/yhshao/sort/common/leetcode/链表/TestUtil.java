package com.yhshao.sort.common.leetcode.链表;

public class TestUtil {


    public static ListNode getList(){


        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(1);
        ListNode listNode3 = new ListNode(2);
        ListNode listNode4 = new ListNode(2);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(3);
        ListNode listNode7 = new ListNode(3);
        ListNode listNode8 = new ListNode(4);
        ListNode listNode9 = new ListNode(6);

        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode9;


        return listNode1;
    }


    public static void printList(ListNode listNode){
        while (listNode != null){
            System.out.print(listNode.val+", ");
            listNode = listNode.next;
        }
    }

}
