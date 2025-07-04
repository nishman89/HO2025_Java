package com.sparta.jdbc;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


// Code loads information from the properties file
public class MySqlConfig {
    private static final Properties properties = new Properties();

    static {
        try (InputStream stream = MySqlConfig.class
                .getClassLoader()
                .getResourceAsStream("config.properties")) {
            if (stream != null) {
                properties.load(stream);
            } else {
                throw new IOException("Unable to find config.properties");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}