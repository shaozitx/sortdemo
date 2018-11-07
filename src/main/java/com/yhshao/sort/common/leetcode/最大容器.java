package com.yhshao.sort.common.leetcode;

import java.util.Map;


/**
 * Created by shaoqi on 11/1/18.
 */
public class 最大容器 {


    public static void main(String[] args) {

        System.out.println(maxArea(new int[]{8}));

    }

    public static int maxArea(int[] height) {

        int maxV = 0;
        int width = 0;
        int h = 0;

        for (int i = 0;i < height.length;i++){
            for (int j = i+1;j < height.length;j++){
                width = j - i;
                h = Math.min(height[i],height[j]);
                maxV = Math.max(maxV,width * h);
            }
        }
        return maxV;
    }
}
