package com.liwentao.entity;

import lombok.Data;

import java.util.List;

/**
 * @author liwentao
 */
@Data
public class XgMenu {
    private Integer mId;
    private String mName;
    private Integer mPid;
    private String mUrl;
    private String level;
    private String createTime;
    private String updateTime;
    private String createBy;
    private String state;
    private String icon;

    private List<XgMenu> xgMenuList;
}
