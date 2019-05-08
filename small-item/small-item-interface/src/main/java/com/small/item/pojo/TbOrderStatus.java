package com.sample;


public class TbOrderStatus {

  private long orderId;
  private long status;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp paymentTime;
  private java.sql.Timestamp consignTime;
  private java.sql.Timestamp endTime;
  private java.sql.Timestamp closeTime;
  private java.sql.Timestamp commentTime;


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getPaymentTime() {
    return paymentTime;
  }

  public void setPaymentTime(java.sql.Timestamp paymentTime) {
    this.paymentTime = paymentTime;
  }


  public java.sql.Timestamp getConsignTime() {
    return consignTime;
  }

  public void setConsignTime(java.sql.Timestamp consignTime) {
    this.consignTime = consignTime;
  }


  public java.sql.Timestamp getEndTime() {
    return endTime;
  }

  public void setEndTime(java.sql.Timestamp endTime) {
    this.endTime = endTime;
  }


  public java.sql.Timestamp getCloseTime() {
    return closeTime;
  }

  public void setCloseTime(java.sql.Timestamp closeTime) {
    this.closeTime = closeTime;
  }


  public java.sql.Timestamp getCommentTime() {
    return commentTime;
  }

  public void setCommentTime(java.sql.Timestamp commentTime) {
    this.commentTime = commentTime;
  }

}
