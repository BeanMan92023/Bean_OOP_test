package com.company;
public class Bean{
    private String type;
    private int number;

    public Bean(String giventype, int givennumber ){
        type = giventype;
        number = givennumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
