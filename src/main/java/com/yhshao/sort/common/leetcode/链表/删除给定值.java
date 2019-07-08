package com.yhshao.sort.common.leetcode.链表;

/**
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 */
public class 删除给定值 {



    public static ListNode removeElements(ListNode head, int val) {

        if (head == null ){
            return null;
        }
        if (head.next == null ){
            return head.val == val ? null : head;
        }
        boolean flag = true;
        ListNode first = head;
        ListNode last = null;
        while (head != null){
            if (head.val == val){
                if (flag){
                    first = head.next;
                }else {
                    last.next = head.next;
                }
            }else {
                flag = false;
                last = head;
            }
            head = head.next;
        }
        return first;
    }


    public static void main(String[] args) {

        TestUtil.printList(removeElements(TestUtil.getList(),2));
    }


}
