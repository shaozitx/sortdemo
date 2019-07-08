package com.yhshao.sort.common.leetcode;

import java.util.Arrays;

public class 最接近三数之和 {


    public static int sumOfThree(int[] nums,int target){
        Integer result = null;
        Integer abs = null;
        if (nums.length<3){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2;i++){
            int j =i+1;
            int  k = nums.length-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(abs == null){
                    abs = Math.abs(sum-target);
                    result = sum;
                } else {
                    if (abs > Math.abs(sum-target)){
                        result = sum;
                        abs = Math.abs(sum-target);
                    }
                }
                if( sum >=target){
                    k--;

                } else if (sum<target){
                    j++;
                }
            }

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sumOfThree(new int[]{0, 1, 2, },3));
    }

}
