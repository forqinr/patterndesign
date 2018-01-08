package com.pd.prototype2.framework;

import java.util.HashMap;

/**
 * @author zhaoyan
 * @since 2018.01.08 15:21
 */
public class Manager {
    private HashMap<String, Product> showCase = new HashMap<>();

    public void register(String name, Product product) {
        showCase.put(name, product);
    }

    public Product create(String name) {
        Product p = showCase.get(name);
        return p.createClone();
    }
}
