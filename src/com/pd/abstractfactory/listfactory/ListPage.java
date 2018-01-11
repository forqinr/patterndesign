package com.pd.abstractfactory.listfactory;

import java.util.Iterator;

import com.pd.abstractfactory.factory.Item;
import com.pd.abstractfactory.factory.Page;

/**
 * @author zhaoyan
 * @since 2018.01.11 11:30
 */
public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><title>" + title + "</title></head><body>\n");

        buffer.append("<h1>" + title + "</h1>\n");

        buffer.append("<ul>\n");
        Iterator it = content.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>");
        buffer.append("<hr><address>" + author + "</address>");

        buffer.append("</body></html>");
        return buffer.toString();
    }
}
