package com.liwentao.mapper;

import com.liwentao.entity.XgMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liwentao
 */
@Mapper
@Repository
public interface SystemMapper {

    List<XgMenu> getMenus(Integer[] mids);

    List<XgMenu> getMenuChildren(Integer[] mids);

    String selectMids(Integer roleId);
}
