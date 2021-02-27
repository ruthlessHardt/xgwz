package com.liwentao.controller.user;

import com.liwentao.anotition.PassLogin;
import com.liwentao.entity.XgUser;
import com.liwentao.http.ResponseResult;
import com.liwentao.service.UserService;
import com.liwentao.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 用户
 * @author liwentao
 */
@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtUtil jwtUtil;

    /**
     * 注册
     * @return
     */
    @PassLogin
    @GetMapping("/register")
    public ResponseResult register(XgUser xgUser){
        return ResponseResult.ok(userService.saveUser(xgUser));
    }

    /**
     * 登录
     * @return
     */
    @PassLogin
    @GetMapping("/login")
    public ResponseResult login(XgUser xgUser, HttpServletResponse response){
        XgUser user = userService.login(xgUser);
        if(user == null){
            return ResponseResult.invalid_request().setMsg("用户名或密码错误");
        }else{
            String token = jwtUtil.createToken(user.getNId().toString());
            //这个是解决跨域时候，前段不能获取到header问题。
            response.setHeader("Access-Control-Expose-Headers",jwtUtil.getHeader());
            response.setHeader(jwtUtil.getHeader(),"liwentao "+token);
            return ResponseResult.ok(user);
        }
    }

    @GetMapping("/searchUser")
    public ResponseResult searchUser(XgUser xgUser){
        List<XgUser> users = userService.searchUser(xgUser);
        if(users == null){
            return ResponseResult.notFound();
        }else{
            return ResponseResult.ok(users);
        }
    }
}
