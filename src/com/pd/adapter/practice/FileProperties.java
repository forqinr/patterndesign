package com.pd.adapter.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * adapter class
 *
 * @author Administrator
 * @since 2017-05-20 22:55
 */

public class FileProperties extends Properties implements FileIO {

    public FileProperties() {
        super();
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        load(new FileInputStream(FileProperties.class.getResource("").getPath() + fileName));
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        store(new FileOutputStream(FileProperties.class.getResource("").getPath() + fileName), "written by FileProperties");
    }

    @Override
    public void setValue(String key, String value) {
        setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return getProperty(key);
    }
}
