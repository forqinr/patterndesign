package com.pd.bridge;

import java.io.FileReader;

public class FileDisplayImpl extends DisplayImpl {
    private String filePath;


    public FileDisplayImpl(String filePath) {
        this.filePath = filePath;

    }

    @Override
    public void rawOpen() {
        System.out.println("+++++++" + filePath + " Start+++++++");
    }

    @Override
    public void rawPrint() {
        try {
            FileReader fileReader = new FileReader(filePath);
            int ch;
            while ((ch = fileReader.read()) != -1) {
                System.out.print((char)ch);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void rawClose() {
        System.out.println("+++++++" + filePath + " End  +++++++");
    }
}
