package com.yhshao.sort.common.leetcode;

/**
 * Created by shaoqi on 10/31/18.
 */
public class 正则匹配 {


    /**
     * 核心的想法就是两个字符串进行比较,.只可以吃掉一个字符,*可以连续吃掉多个相同的字符
     * @param s
     * @param p
     * @return
     */
    public static boolean isMatch3(String s, String p) {

        int j = 0 ,i = 0;
        Character last = null;
        boolean isLength = false;
        while (true){
            char c = s.charAt(i);
            char p1 = p.charAt(j);
            if (p1 == '.'){
                if (j == p.length() -1){
                    if (!isLength){
                        isLength = true;
                        continue;
                    }
                    return false;
                }else {
                    ++j;
                }
            }else if (p1 == '*'){
                if (last == null){
                    last = c;
                }else {
                    if (last != c && j == p.length() - 1){
                        return false;
                    }
                    if (last != c){
                        j++;
                    }
                }
            }else if (c == p1){
                if (j == p.length() -1){
                    if (!isLength){
                        isLength = true;
                        continue;
                    }
                    return false;
                }else {
                    ++j;
                }
            }else if (c != p1){

                return false;
            }else {
                return false;
            }
        }
    }
    public static boolean isMatch2(String s, String p) {

        Character last = null;
        int i = 0,j = 0;
        while (i < p.length()){
            while (j < s.length()){

                char p1 = p.charAt(i);
                char c = s.charAt(j);
                System.out.println(p1+"-----"+c);
                if (p1 == '.'){
                    j++;
                    i++;
                    // 这里应该匹配*前面的东西
                }else if (p1 == '*'){
                    last = p.charAt(i-1);
                    if (last == '.' ){
                        i++;

                    }else {
                        if (last != c){
                            i++;
                        }else {
                            j++;
                        }
                    }

                }else {
                    if (p1 == c){
                        j++;
                        i++;
                    }else {
                        i++;
                    }
                }
                if (j == s.length()){
                    return true;
                }

            }
        }

        return true;
    }
    public static boolean isMatch1(String s, String p) {

        Character last = null;
        boolean islength = true;
        for (int i = 0;i < p.length();i++){

            for (int j = 0;j < s.length();j++){

                char p1 = p.charAt(i);
                char c = s.charAt(j);
                if (p1 == '.'){
                    System.out.println("zheshic==="+c);
                    i++;
                    last = null;
                }else if (p1 == '*'){
                    if (last == null){
                        last = c;
                    }else {
                        if (last != c){
                            if (i == p.length()-1){
                                return false;
                            }else {
                                System.out.println("----");
                                i++;
                            }
                        }
                    }
                }else {
                    last = null;
                }
                if (j == s.length()-1){
                    return true;
                }
            }
        }
        return true;

    }
    public static void main(String[] args) {

//        "mississippi"
//        "mis*is*ip*."

        System.out.println(isMatch("afsaasdfab",".*ba"));
    }


    public static boolean isMatch(String s, String p) {
        if ((s.length()== 0) && (p.length() == 0)) return true;
        //start from end of string and pattern.
        return isMatch(s, p, s.length()-1, p.length()-1);
    }

    public static boolean isMatch(String s, String p, int si, int pi) {
        //return true, if both are empty (-1 means end of string iteration)
        if (pi == -1 && si == -1) return true;

            //if pattern is empty, then true if s is empty, else false
        else if (pi < 0) return si < 0;

        //current pattern char
        char pc = p.charAt(pi);

        //if current pattern char is *
        if (pc == '*') {
            //pat iter len is >= 2 and str iter is not empty
            //current str char matches prev pattern char or
            //prev pattern char is '.' and match remaining str char with current patter
            //Or skip * and its preceding char

            return (pi > 0 && si >= 0 &&
                    ((p.charAt(pi-1) == '.' || p.charAt(pi-1) == s.charAt(si))
                            && isMatch(s, p, si-1, pi)))
                    || isMatch(s, p, si, pi-2);

        } else if (si >= 0 && (pc == '.' || pc == s.charAt(si)) && isMatch(s, p, si-1, pi-1)) {
            //cur pattern char is '.' or prev pattern char matches curr str char, then match rem str and pattern
            return true;
        }
        return false;
    }





}
