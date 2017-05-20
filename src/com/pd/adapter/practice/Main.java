package com.pd.adapter.practice;

import java.io.IOException;

/**
 * test
 *
 * @author Administrator
 * @since 2017-05-20 22:54
 */

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties();

        try {
            f.readFromFile("file.txt");
            f.setValue("year", "2014");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
