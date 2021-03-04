package com.liwentao.service;

import com.liwentao.entity.XgUser;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author liwentao
 */
@Component
public interface UserService {
    /**
     * 注册
     * @param xgUser
     */
    String saveUser(XgUser xgUser);

    /**
     * 登录
     * @param xgUser
     */
    XgUser login(XgUser xgUser);

    /**
     * 查询用户
     * @param xgUser
     * @return
     */
    List<XgUser> searchUser(XgUser xgUser);
    /**
     * 获取数量
     * @return
     */
    List getNum();

    Integer add(XgUser xgUser);

    Integer update(XgUser xgUser);

    Integer delete(Integer nId);
}
