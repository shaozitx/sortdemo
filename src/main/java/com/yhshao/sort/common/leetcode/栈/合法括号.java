package com.yhshao.sort.common.leetcode.栈;

import java.util.HashMap;
import java.util.Stack;

public class 合法括号 {

    public static HashMap map = new HashMap();
    static {
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
    }

    public  static boolean isValid(String s) {

        Stack stack = new Stack();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.get(c) != null){
                stack.push(c);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                if (map.get(stack.peek()).equals(c)){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }

        return stack.isEmpty();

    }


    public static void main(String[] args) {
        System.out.println(isValid("}]]]){}[]"));
    }

}
