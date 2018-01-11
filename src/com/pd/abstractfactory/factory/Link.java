package com.pd.abstractfactory.factory;

/**
 * @author zhaoyan
 * @since 2018.01.11 10:34
 */
public abstract class Link extends Item {
    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
