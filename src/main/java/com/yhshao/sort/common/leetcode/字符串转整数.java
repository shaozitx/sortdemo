package com.yhshao.sort.common.leetcode;

/**
 * Created by shaoqi on 10/30/18.
 */
public class 字符串转整数 {

    public static int myAtoi(String str) {
        str = str.trim();
        String f = "";
        int isPlus = 1;
        boolean last = false;
        for (int i = 0;i < str.length();i++){
            char c= str.charAt(i);
            if (c >= '0' && c <= '9'){

                if ( c == '0' && !last){
                    last = false;
                    continue;
                }else {
                    last = true;
                }
                f += c;
            }else {
                if (i == 0 && c == '-'){
                    isPlus = -1;
                }else if (i == 0 && c == '+'){

                }else {
                    break;
                }
            }
        }
        if (f.length() == 0){
            return 0;
        }
        try{
            return Integer.parseInt(f) * isPlus;
        }catch (Exception e){
            if (isPlus == 1){
                return Integer.MAX_VALUE;
            }else {
                return Integer.MIN_VALUE;
            }
        }
    }


    public static void main(String[] args) {

        System.out.println(myAtoi("  0000000000012345678"));

    }
}
