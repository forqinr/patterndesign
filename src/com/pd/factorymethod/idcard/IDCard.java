package com.pd.factorymethod.idcard;

import com.pd.factorymethod.framework.Product;

public class IDCard implements Product {
    private String owner;
    private int number;

    IDCard(String owner, int number) {
        System.out.println("制作" + owner + "(" + number + ")的ID卡");
        this.owner = owner;
        this.number = number;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "(" + number + ")的ID卡");
    }

    public String getOwner() {
        return owner;
    }

    public int getNumber() {
        return number;
    }
}
