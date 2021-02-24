package com.liwentao.http;

/**
 *http请求code
 * @author liwentao
 */

public enum  HttpEnum {
    /**
     * 请求处理正常
     */
    OK(200, "请求成功"),

    /**
     * 请求成功并且服务器创建了新的资源。
     */
    CREATED(201, "创建成功"),
    /**
     * 用户发出的请求有错误，服务器没有进行新建或修改数据的操作
     */
    INVALID_REQUEST(400, "非法请求"),
    /**
     * 访问内容不存在
     */
    NOTFOUND(404, "访问内容不存在"),
    /**
     * 表示用户没有权限（令牌、用户名、密码错误）
     */
    UNAUTHORIZED(401,"抱歉，您没有权限"),
    /**
     * 表示用户得到授权（与401错误相对），但是访问是被禁止的
     */
    FORBIDDEN(403,"禁止访问"),
    /**
     * 系统内部错误
     */
    INTERNAL_SERVER_ERROR(500, "系统内部错误");

    private String msg;

    private int code;

    private HttpEnum(int code, String msg) {
        this.msg = msg;
        this.code = code;
    }

    /**
     * 获取code
     * @return
     */

    public int code(){
        return code;
    }

    /**
     *  获取msg
     * @return
     */
    public String msg(){
        return msg;
    }
}
