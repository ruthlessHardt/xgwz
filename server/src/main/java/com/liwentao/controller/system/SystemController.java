package com.liwentao.controller.system;

import com.liwentao.anotition.PassLogin;
import com.liwentao.http.ResponseResult;
import com.liwentao.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;;

/**
 * @author liwentao
 */
@CrossOrigin
@RestController
@RequestMapping("/system")
public class SystemController {
    @Autowired
    private SystemService systemService;
    @PassLogin
    @GetMapping("/menus")
    public ResponseResult getMenus(Integer roleId){
        return  ResponseResult.ok(systemService.getMenus(roleId));
    }
}
