package com.pd.abstractfactory.factory;

import java.util.ArrayList;

/**
 * @author zhaoyan
 * @since 2018.01.11 10:35
 */
public abstract class Tray extends Item {
    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}
