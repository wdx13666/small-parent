package com.sample;


public class TbUserCoupon {

  private long couponCode;
  private long couponId;
  private long userId;
  private String status;


  public long getCouponCode() {
    return couponCode;
  }

  public void setCouponCode(long couponCode) {
    this.couponCode = couponCode;
  }


  public long getCouponId() {
    return couponId;
  }

  public void setCouponId(long couponId) {
    this.couponId = couponId;
  }


  public long getUserId() {
    return userId;
  }

  public void setUserId(long userId) {
    this.userId = userId;
  }


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

}
