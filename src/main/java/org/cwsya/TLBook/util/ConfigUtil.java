package org.cwsya.TLBook.util;

import java.io.*;
import java.util.Objects;
import java.util.Properties;

/**
 * @author cws
 */
public class ConfigUtil {
    public static String getConfig(String k){
        Properties pro = new Properties();
        InputStream in = null;
        try {
            in = ConfigUtil.class.getResourceAsStream("/config.properties");
            pro.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String v = pro.getProperty(k);
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return v;
    }
    public static boolean setConfig(String k,String v){
        Properties pro = new Properties();
        InputStream in = null;
        try {
            in = ConfigUtil.class.getResourceAsStream("/config.properties");
            pro.load(in);
        } catch (IOException e) {
            return false;
        }
        Object o = pro.setProperty(k, v);
        try {
            pro.store(new OutputStreamWriter(new FileOutputStream(ConfigUtil.class.getResource("/").getPath()+"/config.properties"),"UTF-8"),"1");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
