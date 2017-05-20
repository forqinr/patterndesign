package com.pd.adapter.classType;

/**
 * 类适配器模式中的适配器
 *
 * @author Administrator
 * @since 2017-05-20 21:44
 */

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
