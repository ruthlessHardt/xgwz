package com.liwentao.mapper;

import com.liwentao.entity.XgMaterialFrom;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liwentao
 */
@Mapper
@Repository
public interface MaterialFromMapper {
    List<XgMaterialFrom> getFrom(XgMaterialFrom xgMaterialFrom);

    Integer addFrom(XgMaterialFrom xgMaterialFrom);

    Integer updateFrom(XgMaterialFrom xgMaterialFrom);

    Integer deleteFrom(Integer fromId);
}
