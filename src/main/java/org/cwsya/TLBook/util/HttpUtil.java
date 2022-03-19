package org.cwsya.TLBook.util;

import com.alibaba.fastjson.JSONObject;
import org.cwsya.TLBook.config.ClientConfig;
import org.cwsya.TLBook.config.ServerConfig;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Map;

/**
 * @author cws
 */
public class HttpUtil {
    public static JSONObject httpPost(String url, Map<String,String> map){
        Connection connection= Jsoup.connect(ServerConfig.URL+url);
        connection.ignoreContentType(true);
        String tokenName = ClientConfig.TOKEN_NAME;
        String token = ConfigUtil.getConfig(tokenName);
        if (token!=null){
            connection.header(tokenName,token);
        }
        connection.data(map);
        Document document = null;
        try {
            document = connection.post();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (JSONObject.parseObject(document.body().text()).getInteger("resultCode")!=100){
            return null;
        }
        return JSONObject.parseObject(document.body().text());
    }
}
