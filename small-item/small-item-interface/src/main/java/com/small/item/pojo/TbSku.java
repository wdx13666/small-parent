package com.sample;


public class TbSku {

  private long id;
  private long spuId;
  private String title;
  private String images;
  private long price;
  private String indexes;
  private String ownSpec;
  private long enable;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp lastUpdateTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getSpuId() {
    return spuId;
  }

  public void setSpuId(long spuId) {
    this.spuId = spuId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getImages() {
    return images;
  }

  public void setImages(String images) {
    this.images = images;
  }


  public long getPrice() {
    return price;
  }

  public void setPrice(long price) {
    this.price = price;
  }


  public String getIndexes() {
    return indexes;
  }

  public void setIndexes(String indexes) {
    this.indexes = indexes;
  }


  public String getOwnSpec() {
    return ownSpec;
  }

  public void setOwnSpec(String ownSpec) {
    this.ownSpec = ownSpec;
  }


  public long getEnable() {
    return enable;
  }

  public void setEnable(long enable) {
    this.enable = enable;
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
