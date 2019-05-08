package com.sample;


public class TbOrder {

  private long orderId;
  private long totalPay;
  private long actualPay;
  private String promotionIds;
  private long paymentType;
  private long postFee;
  private java.sql.Timestamp createTime;
  private String shippingName;
  private String shippingCode;
  private String userId;
  private String buyerMessage;
  private String buyerNick;
  private long buyerRate;
  private String receiverState;
  private String receiverCity;
  private String receiverDistrict;
  private String receiverAddress;
  private String receiverMobile;
  private String receiverZip;
  private String receiver;
  private long invoiceType;
  private long sourceType;


  public long getOrderId() {
    return orderId;
  }

  public void setOrderId(long orderId) {
    this.orderId = orderId;
  }


  public long getTotalPay() {
    return totalPay;
  }

  public void setTotalPay(long totalPay) {
    this.totalPay = totalPay;
  }


  public long getActualPay() {
    return actualPay;
  }

  public void setActualPay(long actualPay) {
    this.actualPay = actualPay;
  }


  public String getPromotionIds() {
    return promotionIds;
  }

  public void setPromotionIds(String promotionIds) {
    this.promotionIds = promotionIds;
  }


  public long getPaymentType() {
    return paymentType;
  }

  public void setPaymentType(long paymentType) {
    this.paymentType = paymentType;
  }


  public long getPostFee() {
    return postFee;
  }

  public void setPostFee(long postFee) {
    this.postFee = postFee;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getShippingName() {
    return shippingName;
  }

  public void setShippingName(String shippingName) {
    this.shippingName = shippingName;
  }


  public String getShippingCode() {
    return shippingCode;
  }

  public void setShippingCode(String shippingCode) {
    this.shippingCode = shippingCode;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getBuyerMessage() {
    return buyerMessage;
  }

  public void setBuyerMessage(String buyerMessage) {
    this.buyerMessage = buyerMessage;
  }


  public String getBuyerNick() {
    return buyerNick;
  }

  public void setBuyerNick(String buyerNick) {
    this.buyerNick = buyerNick;
  }


  public long getBuyerRate() {
    return buyerRate;
  }

  public void setBuyerRate(long buyerRate) {
    this.buyerRate = buyerRate;
  }


  public String getReceiverState() {
    return receiverState;
  }

  public void setReceiverState(String receiverState) {
    this.receiverState = receiverState;
  }


  public String getReceiverCity() {
    return receiverCity;
  }

  public void setReceiverCity(String receiverCity) {
    this.receiverCity = receiverCity;
  }


  public String getReceiverDistrict() {
    return receiverDistrict;
  }

  public void setReceiverDistrict(String receiverDistrict) {
    this.receiverDistrict = receiverDistrict;
  }


  public String getReceiverAddress() {
    return receiverAddress;
  }

  public void setReceiverAddress(String receiverAddress) {
    this.receiverAddress = receiverAddress;
  }


  public String getReceiverMobile() {
    return receiverMobile;
  }

  public void setReceiverMobile(String receiverMobile) {
    this.receiverMobile = receiverMobile;
  }


  public String getReceiverZip() {
    return receiverZip;
  }

  public void setReceiverZip(String receiverZip) {
    this.receiverZip = receiverZip;
  }


  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }


  public long getInvoiceType() {
    return invoiceType;
  }

  public void setInvoiceType(long invoiceType) {
    this.invoiceType = invoiceType;
  }


  public long getSourceType() {
    return sourceType;
  }

  public void setSourceType(long sourceType) {
    this.sourceType = sourceType;
  }

}
