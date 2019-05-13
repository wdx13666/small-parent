package com.small.item.pojo;


import com.baomidou.mybatisplus.annotations.TableId;

public class TbSpecification {

  @TableId
  private long categoryId;
  private String specifications;


  public long getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(long categoryId) {
    this.categoryId = categoryId;
  }


  public String getSpecifications() {
    return specifications;
  }

  public void setSpecifications(String specifications) {
    this.specifications = specifications;
  }

}
