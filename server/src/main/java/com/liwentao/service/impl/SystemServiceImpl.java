package com.liwentao.service.impl;

import cn.hutool.core.convert.Convert;
import com.liwentao.entity.XgMenu;
import com.liwentao.mapper.SystemMapper;
import com.liwentao.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liwentao
 */
@Service
public class SystemServiceImpl implements SystemService {
    @Autowired
    private SystemMapper systemMapper;
    @Override
    public List<XgMenu> getMenus(Integer roleId) {
        if(roleId!=null){
            return systemMapper.getMenus(Convert.toIntArray(systemMapper.selectMids(roleId).split(",")));
        }
        return null;
    }
}
