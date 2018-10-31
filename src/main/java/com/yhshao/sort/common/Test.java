package com.yhshao.sort.common;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.*;

/**
 * Created by shaoqi on 18/2/6.
 */
public class Test {

    private static final List test =new ArrayList<>();

    public void createUser(String name, int age, int version) {

    }

    public static void main(String[] args){

        Set<String> set = new HashSet<>();
        Collections.addAll(set,args);
        System.out.println("888888888");
        System.out.println(set);


        test.add("kjl");
//        test = "43";

    }


    public static void testHashCode(){
        Float f = 20f;
        System.out.println(Float.floatToIntBits(f));
    }

    public static void testEquals(){

        Map<EquialCla,String> map = new HashMap<>();
        map.put(new EquialCla(12,32),"shao");
        System.out.println(map.get(new EquialCla(10,32)));

        EquialCla ec = new EquialCla(13132,131);
        // 423560

        System.out.println(ec.toString());
        System.out.println(Integer.parseInt("67688",16));
    }



    public static void testjava8(){

//        for (Method m : Test.class.getMethods()) {
//            System.out.println("----------------------------------------");
//            System.out.println("   method: " + m.getName());
//            System.out.println("   return: " + m.getReturnType().getName());
//            for (Parameter p : m.getParameters()) System.out.println("parameter: " + p.getType().getName() + ", " + p.getName());
//        }

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
    public static void 希尔排序(){
        int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1};

        int d = a.length;
        while (true){
            d = d / 2;
            for (int i = 0; i<d; i++){
                for (int x = i + d;x<a.length;x = x + d){
                    int temp = a[x];
                    int j;
                    for (j = x - d;j>=0&&a[j] > temp;j = j-d){
                        a[j+d] = a[j];
                    }
                    a[j+d] = temp;

                }
            }

            if (d == 1) break;
        }

        for (int j = 0; j < a.length; j++) System.out.print(a[j] + " ");


    }

    
}
