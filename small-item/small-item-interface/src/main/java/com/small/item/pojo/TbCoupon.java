package com.sample;


public class TbCoupon {

  private long id;
  private String name;
  private String type;
  private long condition;
  private long reduction;
  private long discount;
  private String targets;
  private long stock;
  private java.sql.Timestamp startTime;
  private java.sql.Timestamp endTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public long getCondition() {
    return condition;
  }

  public void setCondition(long condition) {
    this.condition = condition;
  }


  public long getReduction() {
    return reduction;
  }

  public void setReduction(long reduction) {
    this.reduction = reduction;
  }


  public long getDiscount() {
    return discount;
  }

  public void setDiscount(long discount) {
    this.discount = discount;
  }


  public String getTargets() {
    return targets;
  }

  public void setTargets(String targets) {
    this.targets = targets;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }


  public java.sql.Timestamp getStartTime() {
    return startTime;
  }

  public void setStartTime(java.sql.Timestamp startTime) {
    this.startTime = startTime;
  }


  public java.sql.Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
  }

}
