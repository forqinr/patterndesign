package com.pd.prototype2.framework;

import com.pd.prototype2.MessageBox;

/**
 * @author zhaoyan
 * @since 2018.01.08 17:11
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        MessageBox mbox = new MessageBox('*');

        manager.register("m", mbox);

        Product p = manager.create("m");

        p.use("hello world!");

    }
}
