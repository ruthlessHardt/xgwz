package com.liwentao.entity;
import lombok.Data;
/**
 * @author liwentao
 * 入库
 */
@Data
public class XgStorageRecord {
  private long id;
  private String recordId;
  private long materialCategory;
  private String num;
  private long fromId;
  private String materialStatus;
  private String operator;
  private String tel;
  private String materialSupportor;
  private String state;
  private String createTime;
  private String updateTime;
}
