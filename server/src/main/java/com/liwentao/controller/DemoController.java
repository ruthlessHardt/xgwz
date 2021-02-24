package com.liwentao.controller;

import com.liwentao.anotition.PassLogin;
import com.liwentao.entity.Tests;
import com.liwentao.http.ResponseResult;
import com.liwentao.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 测试
 * @author ihooyah
 */
@RestController
@RequestMapping("/test")
public class DemoController {
    @Autowired
    private TestService testService;
    @PassLogin
    @GetMapping("/test1")
    public ResponseResult getInfo(){
        List<Tests> list = testService.getInfo();
        return ResponseResult.ok(list);
    }
}
