package org.cwsya.TLBook.service.Impl;

import com.alibaba.fastjson.JSONObject;
import org.cwsya.TLBook.config.ClientConfig;
import org.cwsya.TLBook.pojo.UserPojo;
import org.cwsya.TLBook.service.LoginService;
import org.cwsya.TLBook.util.HttpUtil;

import java.util.HashMap;

/**
 * @author cws
 */
public class LoginServiceImpl implements LoginService {
    @Override
    public String login(UserPojo userPojo) {
        HashMap<String, String> map = new HashMap<>();
        map.put("userName",userPojo.getUserName());
        map.put("passWord",userPojo.getPassWord());
        JSONObject jsonObject = HttpUtil.httpPost("/admin/login", map);
        if (jsonObject==null){
            return null;
        }
        return jsonObject.getJSONObject("data").getString(ClientConfig.TOKEN_NAME);
    }
}
