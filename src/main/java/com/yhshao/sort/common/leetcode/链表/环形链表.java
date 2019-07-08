package com.yhshao.sort.common.leetcode.链表;

public class 环形链表 {



    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null){
            return false;
        }

        ListNode fast = head.next.next;
        ListNode slow = head.next;

        while (fast == null || fast.next == null){

            fast = fast.next.next;
            slow = slow.next;
            if (fast.equals(slow)){
                return true;
            }
        }
        return false;
    }


}

