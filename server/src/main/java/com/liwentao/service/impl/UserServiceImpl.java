package com.liwentao.service.impl;

import com.liwentao.entity.XgUser;
import com.liwentao.mapper.UserMapper;
import com.liwentao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liwentao
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public String saveUser(XgUser xgUser) {
        return userMapper.saveUser(xgUser);
    }

    @Override
    public XgUser login(XgUser xgUser) {
        return userMapper.login(xgUser);
    }

    @Override
    public List<XgUser> searchUser(XgUser xgUser) {
        return userMapper.searchUser(xgUser);
    }
}
