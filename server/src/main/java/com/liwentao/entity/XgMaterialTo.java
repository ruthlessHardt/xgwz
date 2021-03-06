package com.liwentao.entity;
import lombok.Data;
/**
 * @author liwentao
 * 去向
 */
@Data
public class XgMaterialTo {
  private long toId;
  private String toAreaProvince;
  private String toAreaCity;
  private String toAreaAddress;
  private String contacts;
  private String tel;
  private String toDesc;
  private String state;
  private String createTime;
  private String updateTime;
}
