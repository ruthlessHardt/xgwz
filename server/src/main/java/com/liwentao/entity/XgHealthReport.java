package com.liwentao.entity;
import lombok.Data;
/**
 * @author liwentao
 * 健康上报
 */
@Data
public class XgHealthReport {
  private long id;
  private String name;
  private String fromAddress;
  private String currentAddress;
  private String whetherBeenToRiskArea;
  private String temperature;
  private String respiratoryDisease;
  private String weakness;
  private String digestiveDiseases;
  private String travelPlan;
  private String otherDiseases;
  private String createTime;
  private String updateTime;
}
