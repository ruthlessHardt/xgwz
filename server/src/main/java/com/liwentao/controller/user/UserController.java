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
import java.util.Map;

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

    /**
     * 查询用户
     * @param xgUser
     * @return
     */
    @GetMapping("/searchUser")
    public ResponseResult searchUser(XgUser xgUser){
        List<XgUser> users = userService.searchUser(xgUser);
        if(users == null){
            return ResponseResult.notFound();
        }else{
            return ResponseResult.ok(users);
        }
    }

    /**
     * 获取数量
     * @return
     */
    @GetMapping("/getNum")
    public ResponseResult getNum(){
        List nums = userService.getNum();
        return ResponseResult.ok(nums);
    }


    /**
     * 新增用户
     * @return
     */
    @GetMapping("/add")
    public ResponseResult insertUser(XgUser xgUser){
        Integer code = userService.add(xgUser);
        if(code==1){
            return ResponseResult.invalid_request().setMsg("新增成功");
        }else{
            return ResponseResult.invalid_request().setMsg("新增失败");
        }
    }


    /**
     * 修改用户
     * @return
     */
    @GetMapping("/update")
    public ResponseResult updateUser(XgUser xgUser){
        Integer code = userService.update(xgUser);
        if(code==1){
            return ResponseResult.invalid_request().setMsg("更新成功");
        }else{
            return ResponseResult.invalid_request().setMsg("更新失败");
        }
    }

    /**
     * 删除用户（逻辑删除  state = 0）
     * @return
     */
    @GetMapping("/delete")
    public ResponseResult deleteUser(Integer nId){
        Integer code = userService.delete(nId);
        if(code==1){
            return ResponseResult.invalid_request().setMsg("删除成功");
        }else{
            return ResponseResult.invalid_request().setMsg("删除失败");
        }
    }
}
