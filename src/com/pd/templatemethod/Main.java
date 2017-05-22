package com.pd.templatemethod;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay abstractDisplay = new CharDisplay();
        abstractDisplay.display();

        System.out.println();

        AbstractDisplay abstractDisplay1 = new StringDisplay("Hello World!");
        abstractDisplay1.display();
    }
}
