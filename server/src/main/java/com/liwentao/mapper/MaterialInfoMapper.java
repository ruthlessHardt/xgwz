package com.liwentao.mapper;

import com.liwentao.entity.XgMaterialInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liwentao
 */
@Mapper
@Repository
public interface MaterialInfoMapper {

    List<XgMaterialInfo> getInfo(XgMaterialInfo xgMaterialInfo);

    Integer addInfo(XgMaterialInfo xgMaterialInfo);

    Integer updateInfo(XgMaterialInfo xgMaterialInfo);

    Integer deleteInfo(Integer materialId);
}
