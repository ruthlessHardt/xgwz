package com.liwentao.service.impl;

import com.liwentao.entity.XgMaterialFrom;
import com.liwentao.mapper.MaterialFromMapper;
import com.liwentao.service.MaterialFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liwentao
 */
@Service
public class MaterialFromServiceImpl implements MaterialFromService {
    @Autowired
    private MaterialFromMapper materialFromMapper;
    @Override
    public List<XgMaterialFrom> getFrom(XgMaterialFrom xgMaterialFrom) {
        return materialFromMapper.getFrom(xgMaterialFrom);
    }

    @Override
    public Integer addFrom(XgMaterialFrom xgMaterialFrom) {
        return materialFromMapper.addFrom(xgMaterialFrom);
    }

    @Override
    public Integer updateFrom(XgMaterialFrom xgMaterialFrom) {
        return materialFromMapper.updateFrom(xgMaterialFrom);
    }

    @Override
    public Integer deleteFrom(Integer fromId) {
        return materialFromMapper.deleteFrom(fromId);
    }
}
