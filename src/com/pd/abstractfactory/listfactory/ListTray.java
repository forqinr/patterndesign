package com.pd.abstractfactory.listfactory;

import java.util.Iterator;

import com.pd.abstractfactory.factory.Item;
import com.pd.abstractfactory.factory.Tray;


/**
 * @author zhaoyan
 * @since 2018.01.11 11:24
 */
public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption + "\n");
        buffer.append("<ul>\n");
        Iterator iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item item = (Item) iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
    }

}
