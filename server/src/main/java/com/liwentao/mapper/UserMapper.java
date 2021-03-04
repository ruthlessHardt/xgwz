package com.liwentao.mapper;

import com.liwentao.entity.XgUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 *
 * @author liwentao
 */
@Mapper
@Repository
public interface UserMapper {
    String saveUser(XgUser xgUser);

    XgUser login(XgUser xgUser);

    List<XgUser> searchUser(XgUser xgUser);

    List<Map> getNum();

    Integer add(XgUser xgUser);

    Integer update(XgUser xgUser);

    Integer delete(Integer nId);
}
