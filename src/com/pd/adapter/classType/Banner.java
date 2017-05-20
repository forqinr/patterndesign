package com.pd.adapter.classType;

/**
 * 类适配模式中的现有类
 *
 * @author Administrator
 * @since 2017-05-20 21:41
 */

public class Banner {
    private String str;

    public Banner(String string) {
        this.str = string;
    }

    public void showWithParen() {
        System.out.println("(" + str + ")");
    }

    public void showWithAster() {
        System.out.println("*" + str + "*");
    }
}
