package utils;

import constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;

public final class ReadPropertyFile {
    private ReadPropertyFile(){}
    private static Properties properties = new Properties();
    static {
        FileInputStream fs = null;
        try {
            fs = new FileInputStream(FrameworkConstants.getConfigFilePath());
            properties.load(fs);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getValue(String key) throws Exception {
        String value = "";
        value = properties.getProperty(key);
        if(Objects.isNull(value)){
            throw new Exception("Property name "+key+" is not found. Please check config.properties");
        }
        return value;
    }
}
