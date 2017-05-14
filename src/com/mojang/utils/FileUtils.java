package com.mojang.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * Created by sunny on 2017/5/14.
 */
public class FileUtils {

    private final static String resourcePath = "D:\\JAVA\\mario\\res\\";

    public static InputStream getRsourceAsStream(String fileName) throws FileNotFoundException {
        return new FileInputStream(resourcePath + fileName);
    }
}
