package com.pd.adapter.objectType;

/**
 * 对象适配器模式中的适配器
 *
 * @author Administrator
 * @since 2017-05-20 21:44
 */

public class PrintBanner extends Print {

    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
