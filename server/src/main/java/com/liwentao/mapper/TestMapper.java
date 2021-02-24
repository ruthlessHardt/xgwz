package com.liwentao.mapper;

import com.liwentao.entity.Tests;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author liwentao
 */
@Mapper
@Repository
public interface TestMapper {
    /**
     * ceshi
     * @return
     */
    List<Tests> getInfo();
}
