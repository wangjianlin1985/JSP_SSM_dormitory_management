// 
// 
// 

package com.itheima.util;

import org.apache.commons.lang3.StringUtils;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import org.slf4j.LoggerFactory;
import java.util.Properties;
import org.slf4j.Logger;

public class PropertiesUtil
{
    private static Logger logger;
    private static Properties props;
    
    static {
        PropertiesUtil.logger = LoggerFactory.getLogger((Class)PropertiesUtil.class);
        final String fileName = "mmall.properties";
        PropertiesUtil.props = new Properties();
        try {
            PropertiesUtil.props.load(new InputStreamReader(PropertiesUtil.class.getClassLoader().getResourceAsStream(fileName), "UTF-8"));
        }
        catch (IOException e) {
            PropertiesUtil.logger.error("\u914d\u7f6e\u6587\u4ef6\u8bfb\u53d6\u5f02\u5e38", (Throwable)e);
        }
    }
    
    public static String getProperty(final String key) {
        final String value = PropertiesUtil.props.getProperty(key.trim());
        if (StringUtils.isBlank((CharSequence)value)) {
            return null;
        }
        return value.trim();
    }
    
    public static String getProperty(final String key, final String defaultValue) {
        String value = PropertiesUtil.props.getProperty(key.trim());
        if (StringUtils.isBlank((CharSequence)value)) {
            value = defaultValue;
        }
        return value.trim();
    }
}
