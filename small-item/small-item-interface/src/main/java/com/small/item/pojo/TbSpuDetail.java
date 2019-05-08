package com.sample;


public class TbSpuDetail {

  private long spuId;
  private String description;
  private String specifications;
  private String specTemplate;
  private String packingList;
  private String afterService;


  public long getSpuId() {
    return spuId;
  }

  public void setSpuId(long spuId) {
    this.spuId = spuId;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public String getSpecifications() {
    return specifications;
  }

  public void setSpecifications(String specifications) {
    this.specifications = specifications;
  }


  public String getSpecTemplate() {
    return specTemplate;
  }

  public void setSpecTemplate(String specTemplate) {
    this.specTemplate = specTemplate;
  }


  public String getPackingList() {
    return packingList;
  }

  public void setPackingList(String packingList) {
    this.packingList = packingList;
  }


  public String getAfterService() {
    return afterService;
  }

  public void setAfterService(String afterService) {
    this.afterService = afterService;
  }

}
