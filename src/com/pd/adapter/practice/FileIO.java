package com.pd.adapter.practice;

import java.io.IOException;

/**
 * Created by Administrator on 2017/5/20.
 */
public interface FileIO {
    public void readFromFile(String fileName) throws IOException;

    public void writeToFile(String fileName) throws IOException;

    public void setValue(String key, String value);

    public String getValue(String key);
}
