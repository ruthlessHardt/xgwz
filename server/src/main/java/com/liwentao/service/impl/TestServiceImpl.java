package com.liwentao.service.impl;
import com.liwentao.mapper.TestMapper;
import com.liwentao.entity.Tests;
import com.liwentao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ihooyah
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public List<Tests> getInfo() {
        return testMapper.getInfo();
    }
}
