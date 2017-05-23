package com.pd.prototype;

import com.pd.prototype.framework.Manager;
import com.pd.prototype.framework.Product;
import com.pd.prototype.sub.MessageBox;
import com.pd.prototype.sub.UnderlinePen;

public class Main {
    public static void main(String[] args) {
        // 准备
        Manager manager = new Manager();
        UnderlinePen upen = new UnderlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 生成
        Product p1 = manager.create("strong message");
        p1.use("Hello,World.");
        Product p2 = manager.create("warning box");
        p2.use("Hello,World.");
        Product p3 = manager.create("slash box");
        p3.use("Hello,World.");
    }
}
