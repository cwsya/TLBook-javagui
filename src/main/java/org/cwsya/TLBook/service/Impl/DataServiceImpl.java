package org.cwsya.TLBook.service.Impl;

import com.alibaba.fastjson.JSONObject;
import org.cwsya.TLBook.config.ClientConfig;
import org.cwsya.TLBook.pojo.BookPojo;
import org.cwsya.TLBook.service.DataService;
import org.cwsya.TLBook.util.HttpUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author cws
 */
public class DataServiceImpl implements DataService {
    @Override
    public List<BookPojo> getBook(Integer page, String name) {
        JSONObject jsonObject;
        if (name==null||"".equals(name)){
            jsonObject = HttpUtil.httpPost("/queryBookList/"+page+"/"+ClientConfig.DATA_ROWS, new HashMap<>());
        }else {
            HashMap<String, String> map = new HashMap<>();
            map.put("bookName",name);
            jsonObject = HttpUtil.httpPost("/queryBookList/"+page+"/"+ClientConfig.DATA_ROWS, map);
        }
        if (jsonObject==null){
            return null;
        }
        if (jsonObject.getInteger("resultCode")==100){

            List<BookPojo> bookPojos1 = JSONObject.parseArray(, BookPojo.class);
            System.out.println(bookPojos1);


        }
        System.out.println(jsonObject.toJSONString());
        return null;
    }
}
