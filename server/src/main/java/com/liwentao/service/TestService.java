package com.liwentao.service;

import com.liwentao.entity.Tests;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liwentao
 */
@Component
public interface TestService {
    /**
     * ceshi
     * @return
     */
    List<Tests> getInfo();
}
