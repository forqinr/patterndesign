package com.pd.templatemethod;

public class StringDisplay extends AbstractDisplay {
    private String str;

    StringDisplay(String str) {
        this.str = str;
    }

    private void printIns() {
        System.out.print("+");
        for (int i = 0; i < str.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }

    @Override
    public void open() {
        printIns();
    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {
        printIns();
    }
}
