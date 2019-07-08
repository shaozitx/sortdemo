package com.yhshao.sort.common.leetcode.栈;

import java.util.Stack;

public class 栈实现队列 {

    private Stack<Integer> inStack = new Stack();
    private Stack<Integer> outStack = new Stack();

    /** Initialize your data structure here. */
    public 栈实现队列() {

    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        checkOutStack();

        return outStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        checkOutStack();
        return outStack.peek();
    }

    private void checkOutStack(){
        if (outStack.isEmpty()){
            while (!inStack.isEmpty()){
                outStack.push(inStack.pop());
            }
        }
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }
}
