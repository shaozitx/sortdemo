package com.yhshao.sort.common.leetcode;

import java.util.Date;

/**
 * Created by shaoqi on 10/30/18.
 */
public class 回文子串 {


    public static String longestPalindrome(String s) {
        String subStr;
        String finalStr = "";
        int length = 0;
        for (int i = 0;i < s.length();i++){
            for (int j = s.length(); j>=i+1;j--){
                subStr = getRealLenth(s.substring(i,j));
                if (subStr.length() > length){
                    finalStr = subStr;
                    length = subStr.length();
                    break;
                }
            }
            if (length >= s.length()){
                break;
            }
        }
        return finalStr;
    }
    /**
     * 判定一个串是不是回文
     * @param str
     * @return
     */
    public static String getRealLenth(String str){
        int length = str.length();
        String str1 = str;
        for (int i = 0;i < length / 2;i++){
            if (str.charAt(i) != str.charAt(length - i - 1)){
                str1 = "";
                break;
            }
        }
        return str1;
    }

    public static void main(String[] args) {
        Long time = System.currentTimeMillis();
        // 255
        System.out.println(longestPalindrome("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaadddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddddd"));
        System.out.println(System.currentTimeMillis() - time);

    }

}
