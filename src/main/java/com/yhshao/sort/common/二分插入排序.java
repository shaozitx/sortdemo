package com.yhshao.sort.common;

import javax.swing.plaf.basic.BasicScrollPaneUI;
import java.sql.*;
import java.util.*;

/**
 * Created by shaoqi on 17/12/14.
 */
public class 二分插入排序 {


    /**
     * 时间复杂度 最坏的情况为n2/2，最好的情况为n，平均移动次数为O(n2)。
     * @param args
     */
    public static void main(String[] args) {


        try{
            String URL="jdbc:mysql://127.0.0.1:3306/db?Encoding=utf-8&useSSL=false";
            String USER="root";
            String PASSWORD="123456";
            //1.加载驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.获得数据库链接
            Connection conn=DriverManager.getConnection(URL, USER, PASSWORD);
            //3.通过数据库的连接操作数据库，实现增删改查（使用Statement类）
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("select * from user");
            //4.处理数据库的返回结果(使用ResultSet类)
            while(rs.next()){
                System.out.println(rs.getInt("id")+" "
                        +rs.getInt("phone_type"));
            }

            //关闭资源
            rs.close();
            st.close();
            conn.close();

        }catch (Exception e){
            System.out.println(e);

        }

//        int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
//        System.out.println("排序之前：");
//        for (int i:a) {
//            System.out.print(i);
//        }
//        //二分插入排序
//        sort(a);
//        System.out.println();
//        System.out.println("排序之后：");
//
//        for (int i :a) {
//            System.out.print(i);
//        }

    }

    private static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            int left = 0;
            int right = i-1;
            int mid ;
            // 判断当前值,在多次切割数组前半段还是后半段
            while(left<=right){
                mid = (left+right)/2;
                if(temp<a[mid])  {
                    right = mid-1;
                } else{
                    left = mid+1;
                }
            }
            // 如果这时left已经等于i了,就说明已经是顺位了
            for (int j = i-1; j >= left; j--) {
                a[j+1] = a[j];
            }
            // 如果不是顺位就换位置
            if(left != i)  {
                a[left] = temp;
            }
        }
    }
}
