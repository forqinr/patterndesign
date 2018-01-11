package com.pd.abstractfactory.factory;

/**
 * @author zhaoyan
 * @since 2018.01.11 10:33
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
