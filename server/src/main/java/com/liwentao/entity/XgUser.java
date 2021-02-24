package com.liwentao.entity;

import lombok.Data;

/**
 * 用户
 * @author liwentao
 */
@Data
public class XgUser {
    private Integer nId;
    private String nuName;
    private String nPassword;
    private String nPhone;
    private String nSex;
    private String nDept;
    private String createTime;
    private String updateTime;
    private String state;
    private String createBy;
    private String avatar;
}
