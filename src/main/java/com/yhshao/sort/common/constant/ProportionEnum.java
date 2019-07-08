package com.yhshao.sort.common.constant;

public enum ProportionEnum {


    ONE_THIRD(1.0/3,"三分之一");


    private double value;
    private String desc;

    ProportionEnum(double value, String desc){
        this.value = value;
        this.desc = desc;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
