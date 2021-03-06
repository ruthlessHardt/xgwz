package com.liwentao.entity;
import lombok.Data;
/**
 * @author liwentao
 * 物资类型
 */
@Data
public class XgMaterialType {
  private long typeId;
  private String typeCode;
  private String typeName;
  private String level;
  private String typeDesc;
  private String state;
  private String createTime;
  private String updateTime;
}
