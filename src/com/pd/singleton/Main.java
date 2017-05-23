package com.pd.singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start.");

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2) {
            System.out.println("s1和s2是相同的实例");
        } else {
            System.out.println("s1和s2是不同的实例");
        }

        System.out.println("End.");
    }
}
