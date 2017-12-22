package com.yhshao.sort.common;

/**
 * Created by shaoqi on 17/12/14.
 */
public class 直接插入排序 {


    /**
     * 直接插入排序的时间复杂度介于O(n) 到 O(n2) 之间,受原始数据影响比较大
     * @param args
     */
    public static void main(String[] args) {
            int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};
            System.out.println("排序之前：");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }
            //直接插入排序
            for (int i = 1; i < a.length; i++) {
                //待插入元素
                int temp = a[i];
                System.out.println(i+"-------"+temp);

                int j;

                for (j = i-1; j>=0; j--) {
                    //将大于temp的往后移动一位
                    if(a[j]>temp){
                        a[j+1] = a[j];
                    }else{
                        break;
                    }
                }
                System.out.println(j+"-------");
                a[j+1] = temp;
            }
            System.out.println();
            System.out.println("排序之后：");
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }
        }



}
