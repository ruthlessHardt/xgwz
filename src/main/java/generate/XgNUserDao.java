package generate;

import generate.XgNUser;

public interface XgNUserDao {
    int deleteByPrimaryKey(Integer nId);

    int insert(XgNUser record);

    int insertSelective(XgNUser record);

    XgNUser selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(XgNUser record);

    int updateByPrimaryKey(XgNUser record);
}