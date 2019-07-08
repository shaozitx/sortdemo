package com.yhshao.sort.common.leetcode.链表;


/**
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
 */
public class 删除重复元素 {


    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }

        int val = head.val;
        ListNode last = head;
        ListNode first = head;
        while (head.next != null){
            head = head.next;

            if (val == head.val){
                last.next = head.next;
            }else {
                val = head.val;
                last = head;
            }
        }

        return first;
    }


    public static void main(String[] args) {
        TestUtil.printList(deleteDuplicates(TestUtil.getList()));
    }

}
