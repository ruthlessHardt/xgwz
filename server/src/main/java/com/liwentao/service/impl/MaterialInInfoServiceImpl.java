package com.liwentao.service.impl;

import com.liwentao.entity.XgMaterialInfo;
import com.liwentao.mapper.MaterialInfoMapper;
import com.liwentao.service.MaterialInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liwentao
 */
@Service
public class MaterialInInfoServiceImpl implements MaterialInfoService {

    @Autowired
    private MaterialInfoMapper materialInfoMapper;

    @Override
    public List<XgMaterialInfo> getInfo(XgMaterialInfo xgMaterialInfo) {
        return materialInfoMapper.getInfo(xgMaterialInfo);
    }

    @Override
    public Integer addInfo(XgMaterialInfo xgMaterialInfo) {
        return materialInfoMapper.addInfo(xgMaterialInfo);
    }

    @Override
    public Integer updateInfo(XgMaterialInfo xgMaterialInfo) {
        return materialInfoMapper.updateInfo(xgMaterialInfo);
    }

    @Override
    public Integer deleteInfo(Integer materialId) {
        return materialInfoMapper.deleteInfo(materialId);
    }
}
