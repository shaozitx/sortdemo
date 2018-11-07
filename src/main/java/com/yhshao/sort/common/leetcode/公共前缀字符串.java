package com.yhshao.sort.common.leetcode;

/**
 * Created by shaoqi on 11/2/18.
 */
public class 公共前缀字符串 {

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[]{"b","cb","cab"}));

    }


    public static String longestCommonPrefix(String[] strs) {

        if (strs.length < 1){
            return "";
        }

        Character c = null;
        String result = "";
        boolean isSame = true;
        boolean iscricle = false;
        int i = 0;
        while (isSame){
            for (int j = 0;j < strs.length;j++){
                if (i < strs[j].length()){

                    if (c == null ){
                        c  = strs[j].charAt(i);
                        iscricle = false;
                    }
                    if (c == strs[j].charAt(i)){
                        if (j == strs.length-1){
                            result += c;
                            iscricle = true;
                        }
                    }else {
                        isSame = false;
                        break;
                    }
                    c  = strs[j].charAt(i);
                    if (iscricle){
                        c = null;
                    }
                }else {
                    return result;
                }
            }
            i++;
        }
        return result;
    }

}
