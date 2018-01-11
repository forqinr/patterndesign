package com.pd.abstractfactory.listfactory;

import com.pd.abstractfactory.factory.Link;

/**
 * @author zhaoyan
 * @since 2018.01.11 11:21
 */
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    @Override
    public String makeHTML() {
        return "<li><a href='" + url + "'>" + caption + "</a></li> \n";
    }
}
