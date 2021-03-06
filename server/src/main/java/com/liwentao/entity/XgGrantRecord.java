package com.liwentao.entity;
import lombok.Data;
/**
 * @author liwentao
 * 发放记录
 */
@Data
public class XgGrantRecord {
  private long id;
  private String recordId;
  private String grantCategory;
  private String num;
  private long fromId;
  private long toId;
  private String level;
  private String materialStatus;
  private String operator;
  private String tel;
  private String materialSupportor;
  private String state;
  private String createTime;
  private String updateTime;
}
