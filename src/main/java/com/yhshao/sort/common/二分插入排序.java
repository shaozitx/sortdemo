package com.yhshao.sort.common;

/**
 * Created by shaoqi on 17/12/14.
 */
public class 二分插入排序 {


    /**
     * 时间复杂度 最坏的情况为n2/2，最好的情况为n，平均移动次数为O(n2)。
     * @param args
     */
    public static void main(String[] args) {
        int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
        System.out.println("排序之前：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        //二分插入排序
        sort(a);
        System.out.println();
        System.out.println("排序之后：");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }

    private static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int left = 0;
            int right = i-1;
            int mid = 0;
            // 判断当前值,在多次切割数组前半段还是后半段
            while(left<=right){
                mid = (left+right)/2;
                if(temp<a[mid]){ // 将数组向前切割
                    right = mid-1;
                }else{           // 直到获取最大的left
                    left = mid+1;
                }
            }
            // 如果这时left已经等于i了,就说明已经是顺位了
            for (int j = i-1; j >= left; j--) {
                a[j+1] = a[j];
            }
            // 如果不是顺位就换位置
            if(left != i){
                a[left] = temp;
            }
        }
    }

}
