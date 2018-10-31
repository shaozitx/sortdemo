package com.yhshao.sort.common;

/**
 * Created by shaoqi on 10/26/18.
 */
public  class EquialCla {

    public int var1;
    public int var2;

    public EquialCla(int var1 ,int var2){
        this.var1 = var1;
        this.var2 = var2;
    }

    @Override public boolean equals(Object o){

        if (o == this){
            return true;
        }
        if (!(o instanceof EquialCla)){
            return false;
        }

        return ((EquialCla) o).var1 == var1 && ((EquialCla) o).var2 == var2;


    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result * 31 + var1;
        result = result * 31 + var2;
        return result;
    }
}
