package com.pd.templatemethod;

public class CharDisplay extends AbstractDisplay {
    @Override
    public void open() {
        System.out.print("<<<");
    }

    @Override
    public void print() {
        System.out.print("H");
    }

    @Override
    public void close() {
        System.out.print(">>>");
    }
}
