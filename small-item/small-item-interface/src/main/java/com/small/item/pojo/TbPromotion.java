package com.sample;


public class TbPromotion {

  private long id;
  private String type;
  private String description;
  private long condition;
  private long reduction;
  private long seckillPrice;
  private long couponId;
  private String targets;
  private java.sql.Timestamp startTime;
  private java.sql.Timestamp endTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
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


  public long getSeckillPrice() {
    return seckillPrice;
  }

  public void setSeckillPrice(long seckillPrice) {
    this.seckillPrice = seckillPrice;
  }


  public long getCouponId() {
    return couponId;
  }

  public void setCouponId(long couponId) {
    this.couponId = couponId;
  }


  public String getTargets() {
    return targets;
  }

  public void setTargets(String targets) {
    this.targets = targets;
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
