package com.liwentao.entity;


import lombok.Data;

/**
 * @author liwentao
 * 物资资料
 */
@Data
public class XgMaterialInfo {
  private long materialId;
  private String materialName;
  private String materialImg;
  private String materialTypeId;
  private String materialSpecifications;
  private String materialUnit;
  private String materialDesc;
  private String state;
  private String createTime;
  private String updateTime;
}
