package com.yhshao.sort.common.leetcode;

/**
 * Created by shaoqi on 11/1/18.
 */
public class 罗马数字 {


    public static void main(String[] args) {
        System.out.println(intToRoman(1000));
    }



    public static String intToRoman(int num) {

        String head = "";
        if (num >= 1000){
            head = getFormatString("M",num / 1000);
        }
        num = num % 1000;

        // 对数字用10取模
        int mod = 0;
        int i = 0;
        String numStr = num+"";
        String roman = "";
        while (i<numStr.length()){
            i++;
            mod = num % 10;
            num = num / 10;
            roman =  getStr(roman,mod,i) + roman;
        }
        return head + roman;
    }


    public static String getStr(String roman,int mod,int index){

        if (index == 1){
            if (mod == 4){
                return "IV";
            }else if (mod == 9){
                return "IX";
            }
            if (mod >= 5){
                roman = "V"+ getFormatString("I",mod-5);
            }else {
                roman = getFormatString("I",mod);
            }
        }else if (index == 2){
            if (mod == 4){
                return "XL";
            }else if (mod == 9){
                return "XC";
            }
            if (mod >= 5){
                roman = "L"+ getFormatString("X",mod-5);
            }else {
                roman = getFormatString("X",mod);
            }
        }else if (index == 3){
            if (mod == 4){
                return "CD";
            }else if (mod == 9){
                return "CM";
            }
            if (mod >= 5){
                roman = "D"+ getFormatString("C",mod-5);
            }else {
                roman = getFormatString("C",mod);
            }
        }

        return roman;
    }

    public static String getFormatString(String roman,int count){
        String newRoman = "";
        while (count != 0){
            count--;
            newRoman += roman;
        }
        return newRoman;
    }

}
