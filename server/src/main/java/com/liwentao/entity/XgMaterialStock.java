package com.liwentao.entity;
import lombok.Data;
/**
 * @author liwentao
 * 库存
 */
@Data
public class XgMaterialStock {

  private long id;
  private long infoId;
  private long fromId;
  private long num;
  private String createTime;
  private String updateTime;
}
