package com.liwentao.service;

import com.liwentao.entity.XgMaterialInfo;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liwentao
 */
@Component
public interface MaterialInfoService {
    List<XgMaterialInfo> getInfo(XgMaterialInfo xgMaterialInfo);

    Integer addInfo(XgMaterialInfo xgMaterialInfo);

    Integer updateInfo(XgMaterialInfo xgMaterialInfo);

    Integer deleteInfo(Integer materialId);

}
