package com.liwentao.service;

import com.liwentao.entity.XgMaterialFrom;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liwentao
 */
@Component
public interface MaterialFromService {
    List<XgMaterialFrom> getFrom(XgMaterialFrom xgMaterialFrom);
    Integer addFrom(XgMaterialFrom xgMaterialFrom);
    Integer updateFrom(XgMaterialFrom xgMaterialFrom);
    Integer deleteFrom(Integer fromId);
}
