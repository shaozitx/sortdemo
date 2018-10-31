package com.yhshao.sort.common.leetcode;

/**
 * Created by shaoqi on 10/30/18.
 */
public class 两数组中位数 {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] newnum = new int[nums1.length+nums2.length];
        for (int i = 0,j = 0,k = 0;k<nums1.length+nums2.length;k++){

            if ( j==nums2.length || i<nums1.length && nums1[i] < nums2[j]){
                newnum[k] = nums1[i];
                ++i;
            }else {
                newnum[k] = nums2[j];
                ++j;
            }
        }

        int first = newnum.length / 2;
        if (newnum.length % 2 == 1){
            return newnum[first];
        }else {
            System.out.println(newnum[first]);
            System.out.println(newnum[first-1]);

            return (newnum[first]+newnum[first-1]) / 2.0;
        }
    }


    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));

    }
}
