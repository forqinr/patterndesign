package com.pd.prototype2;

import com.pd.prototype2.framework.Product;

public class MessageBox implements Product {
    private char docochar;

    public MessageBox(char docochar) {
        this.docochar = docochar;
    }

    @Override
    public void use(String s) {
        for (int i = 0; i < s.length() + 2; i++) {
            System.out.print(this.docochar);
        }

        System.out.println();
        System.out.print(this.docochar);
        System.out.print(s);
        System.out.println(this.docochar);

        for (int i = 0; i < s.length() + 2; i++) {
            System.out.print(this.docochar);
        }

    }

    @Override
    public Product createClone() {
        Product product = null;
        try {
            product = (Product) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}