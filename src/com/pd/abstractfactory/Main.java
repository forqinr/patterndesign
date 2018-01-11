package com.pd.abstractfactory;

import com.pd.abstractfactory.factory.Factory;
import com.pd.abstractfactory.factory.Link;
import com.pd.abstractfactory.factory.Page;
import com.pd.abstractfactory.factory.Tray;

/**
 * @author zhaoyan
 * @since 2018.01.11 10:31
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage:java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1:java Main listfactory.ListFactory");
            System.out.println("Example 1:java Main tablefactory.TableFactory");
            System.exit(0);
        }

        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("人民日报", "http://www.people.com.cn/");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.com.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("日报");
        traynews.add(people);
        traynews.add(gmw);

        Tray traySearch = factory.createTray("搜索引擎");
        traySearch.add(us_yahoo);
        traySearch.add(jp_yahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("LinkPage", "过客容颜");
        page.add(traynews);
        page.add(traySearch);
        page.output();
    }
}
