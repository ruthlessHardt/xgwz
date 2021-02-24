package com.liwentao.mapper;

import com.liwentao.entity.XgUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

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
}
