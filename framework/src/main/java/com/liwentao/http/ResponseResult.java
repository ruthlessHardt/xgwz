package com.liwentao.http;

import java.io.Serializable;

/**
 * @author liwentao
 */
public class ResponseResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;
    //响应编码
    private int code;
    //提示信息
    private String msg;
    //响应数据
    private T data;

    //根据属性构建ResponseResult
    private static <T> ResponseResult<T> build( int code,String msg,T data) {
        return new ResponseResult<T>().setCode(code).setMsg(msg).setData(data);
    }

    //构建一些常用的
    //请求正常
    public static <T> ResponseResult<T> ok(){
        return build(HttpEnum.OK.code(),HttpEnum.OK.msg(),null);
    }
    public static <T> ResponseResult<T> ok(T data){
        return build(HttpEnum.OK.code(),HttpEnum.OK.msg(),data);
    }
    //创建成功
    public static <T> ResponseResult<T> created(){
        return build(HttpEnum.CREATED.code(),HttpEnum.CREATED.msg(),null);
    }
    //非法请求
    public static <T> ResponseResult<T> invalid_request(){
        return build(HttpEnum.INVALID_REQUEST.code(),HttpEnum.INVALID_REQUEST.msg(),null);
    }
    //访问内容不存在
    public static <T> ResponseResult<T> notFound(){
        return build(HttpEnum.NOTFOUND.code(),HttpEnum.NOTFOUND.msg(),null);
    }
    //没有权限
    public static <T> ResponseResult<T> unauthorized(){
        return build(HttpEnum.UNAUTHORIZED.code(),HttpEnum.UNAUTHORIZED.msg(),null);
    }
    //禁止访问
    public static <T> ResponseResult<T> forbidden(){
        return build(HttpEnum.FORBIDDEN.code(),HttpEnum.FORBIDDEN.msg(),null);
    }
    //系统内部错误
    public static <T> ResponseResult<T> internal_server_error(){
        return build(HttpEnum.INTERNAL_SERVER_ERROR.code(),HttpEnum.INTERNAL_SERVER_ERROR.msg(),null);
    }

    //getter和setter
    public int getCode() {
        return code;
    }
    //注意返回值类型
    public ResponseResult<T> setCode(int code) {
        this.code = code;
        return this;
    }

    public String getMsg() {
        return msg;
    }
    //注意返回值类型
    public ResponseResult<T> setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public T getData() {
        return data;
    }
    //注意返回值类型
    public ResponseResult<T> setData(T data) {
        this.data = data;
        return this;
    }
}
