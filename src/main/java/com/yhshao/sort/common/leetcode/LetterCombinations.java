package com.yhshao.sort.common.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {


    public static List<String> letterCombinations(String digits) {

        List<String> strs = new ArrayList<>();

        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) == '1'){
                continue;
            }
            if (strs.size() == 0){
                for (char c:digits.toCharArray()) {
                    if (c != '1'){
                        for (char c1:getChars(c)) {
                            strs.add(c1+"");
                        }
                        i++;
                        break;
                    }
                }
            }

        }
        return strs;
    }

    public static List<String> getStrs(char c,List<String> strs){

        List<String> strings = new ArrayList<>();
        for (String s:strs) {
            for (char c1:getChars(c)) {
                strings.add(s+c1);
            }
        }
        return strings;
    }

    public static char[] getChars(char c){
        if (c == '2'){
            return "abc".toCharArray();
        }
        if (c == '3'){
            return "def".toCharArray();
        }if (c == '4'){
            return "ghi".toCharArray();
        }if (c == '5'){
            return "jkl".toCharArray();
        }if (c == '6'){
            return "mno".toCharArray();
        }if (c == '7'){
            return "pqrs".toCharArray();
        }if (c == '8'){
            return "tuv".toCharArray();
        }
        if (c == '9'){
            return "wxyz".toCharArray();
        }

        return null;
    }



    public static void main(String[] args) {

        for (String str:letterCombinations("2")) {
            System.out.println(str);
        }
    }
}
