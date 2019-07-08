package com.yhshao.sort.common.leetcode.链表;


/**
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/solution/
 */
public class 中间节点 {



    public static ListNode middleNode(ListNode head) {


        if (head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        int i = 0;
        int j = 0;
        while (fast.next != null){
            i++;
            fast = fast.next;
            if (i % 2 == 1){
                slow = slow.next;
                j++;
            }
        }

        return slow;


    }


    public static void main(String[] args) {
//        int j = 0;
//        for (int i = 0; i < 100; i++) {
//
//            j += i % 2;
//
//            System.out.println(i + "-----" + j);
//
//        }

        TestUtil.printList(middleNode(TestUtil.getList()));



    }


}
