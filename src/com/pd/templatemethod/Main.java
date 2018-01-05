package com.pd.templatemethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay abstractDisplay = new CharDisplay();
        abstractDisplay.display();

        System.out.println();

        AbstractDisplay abstractDisplay1 = new StringDisplay("Hello World!");
        abstractDisplay1.display();

        AbstractDisplay abstractDisplay2 = new StringDisplay("你好，世界");
        System.out.println();
        abstractDisplay2.display();
    }
}
