package com.pd.prototype2.framework;

public interface Product extends Cloneable {
    void use(String s);

    Product createClone();
}
