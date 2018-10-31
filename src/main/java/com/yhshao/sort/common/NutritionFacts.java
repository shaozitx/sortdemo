package com.yhshao.sort.common;

/**
 * Created by shaoqi on 10/24/18.
 */
public class NutritionFacts {

    private final int var1;
    private final int var2;
    private final int var3;
    private final int var4;
    private final int var5;
    private final int var6;


    public NutritionFacts(int var1,int var2){
        this(var1,var2,0);
    }
    public NutritionFacts(int var1,int var2,int var3){
        this(var1,var2,var3,0);
    }

    public NutritionFacts(int var1,int var2,int var3,int var4){
        this(var1,var2,var3,var4,0);
    }

    public NutritionFacts(int var1,int var2,int var3,int var4,int var5){
        this(var1,var2,var3,var4,var5,0);
    }

    /**
     * 重叠构造器
     * @param var1
     * @param var2
     * @param var3
     * @param var4
     * @param var5
     * @param var6
     */
    public NutritionFacts(int var1,int var2,int var3,int var4,int var5,int var6){
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
        this.var5 = var5;
        this.var6 = var6;

    }


    /**
     * 1.上面属于重叠构造器模式
     * 2.还有一种典型的set get模式
     * 3.推荐的build模式(链式调用,统一生成)
     *
     */





}
