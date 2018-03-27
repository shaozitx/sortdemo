package com.yhshao.sort.common;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;

/**
 * Created by shaoqi on 18/2/6.
 */
public class Test {


    public void createUser(String name, int age, int version) {

    }

    public static void main(String[] args){


    }




    public static void testjava8(){

        for (Method m : Test.class.getMethods()) {
            System.out.println("----------------------------------------");
            System.out.println("   method: " + m.getName());
            System.out.println("   return: " + m.getReturnType().getName());
            for (Parameter p : m.getParameters()) System.out.println("parameter: " + p.getType().getName() + ", " + p.getName());
        }
    }
    public static void 直接插入排序(){

        int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
        for (int i = 0; i < a.length; i++) {

            int temp = a[i];
            int j;
            for ( j = i - 1; j >=0 ; j--) {

                if (a[j] > temp) a[j+1] = a[j];
                else break;
            }

            a[j+1] = temp;

        }

        for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");

    }
    public  static void 冒泡排序(){
        int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) System.out.print(a[i]+ " ");
    }

    
}
