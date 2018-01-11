package com.pd.abstractfactory.listfactory;

import com.pd.abstractfactory.factory.Factory;
import com.pd.abstractfactory.factory.Link;
import com.pd.abstractfactory.factory.Page;
import com.pd.abstractfactory.factory.Tray;

/**
 * @author zhaoyan
 * @since 2018.01.11 11:20
 */
public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
