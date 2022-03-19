package org.cwsya.TLBook.service;

import org.cwsya.TLBook.pojo.UserPojo;

/**
 * @author cws
 */
public interface LoginService {
    /**
     * 登录
     * @param userPojo 用户信息
     * @return token
     */
    String login(UserPojo userPojo);
}
