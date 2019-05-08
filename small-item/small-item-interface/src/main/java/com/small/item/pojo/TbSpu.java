package com.sample;


public class TbSpu {

  private long id;
  private String title;
  private String subTitle;
  private long cid1;
  private long cid2;
  private long cid3;
  private long brandId;
  private long saleable;
  private long valid;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp lastUpdateTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getSubTitle() {
    return subTitle;
  }

  public void setSubTitle(String subTitle) {
    this.subTitle = subTitle;
  }


  public long getCid1() {
    return cid1;
  }

  public void setCid1(long cid1) {
    this.cid1 = cid1;
  }


  public long getCid2() {
    return cid2;
  }

  public void setCid2(long cid2) {
    this.cid2 = cid2;
  }


  public long getCid3() {
    return cid3;
  }

  public void setCid3(long cid3) {
    this.cid3 = cid3;
  }


  public long getBrandId() {
    return brandId;
  }

  public void setBrandId(long brandId) {
    this.brandId = brandId;
  }


  public long getSaleable() {
    return saleable;
  }

  public void setSaleable(long saleable) {
    this.saleable = saleable;
  }


  public long getValid() {
    return valid;
  }

  public void setValid(long valid) {
    this.valid = valid;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getLastUpdateTime() {
    return lastUpdateTime;
  }

  public void setLastUpdateTime(java.sql.Timestamp lastUpdateTime) {
    this.lastUpdateTime = lastUpdateTime;
  }

}
