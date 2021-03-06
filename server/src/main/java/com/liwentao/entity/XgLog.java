package com.liwentao.entity;
import lombok.Data;
/**
 * @author liwentao
 * 操作日志
 */
@Data
public class XgLog {
  private long id;
  private String code;
  private String event;
  private String operator;
  private String createTime;
  private String updateTime;
  private String state;
}
