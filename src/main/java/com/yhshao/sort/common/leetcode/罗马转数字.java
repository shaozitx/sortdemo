package com.yhshao.sort.common.leetcode;

/**
 * Created by shaoqi on 11/2/18.
 */
public class 罗马转数字 {

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }


    public static int romanToInt(String s) {

        int sum = 0;
        for (int i = s.length()-1;i > -1 ;i--){
            char c = s.charAt(i);
            if (c == 'V'){
                if (i > 0){
                    if (s.charAt(i-1) == 'I'){
                        sum += 4;
                        i--;
                    }else {
                        sum += 5;
                    }
                }else {
                    sum += 5;
                }
            }else if (c == 'X'){
                if (i > 0){
                    if (s.charAt(i-1) == 'I'){
                        sum += 9;
                        i--;
                    }else {
                        sum += 10;
                    }
                }else {
                    sum += 10;
                }
            }else if (c == 'L'){

                if (i > 0){
                    if (s.charAt(i-1) == 'X'){
                        sum += 40;
                        i--;
                    }else {
                        sum += 50;
                    }
                }else {
                    sum += 50;
                }
            }else if (c == 'C'){

                if (i > 0){
                    if (s.charAt(i-1) == 'X'){
                        sum += 90;
                        i--;
                    }else {
                        sum += 100;
                    }
                }else {
                    sum += 100;
                }
            }else if (c == 'D'){

                if (i > 0){
                    if (s.charAt(i-1) == 'C'){
                        sum += 400;
                        i--;
                    }else {
                        sum += 500;
                    }
                }else {
                    sum += 500;
                }

            }else if (c == 'M'){
                if (i > 0){
                    if (s.charAt(i-1) == 'C'){
                        sum += 900;
                        i--;
                    }else {
                        sum += 1000;
                    }
                }else {
                    sum += 1000;
                }
            }else {
                sum += 1;
            }

        }
        return sum;
    }
}
