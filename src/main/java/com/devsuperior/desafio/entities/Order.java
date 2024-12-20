package com.devsuperior.desafio.entities;

public class Order {

  private Integer code;
  private Double basic;
  private Double discount;

  public Order(Integer code, Double basic, Double discount) {
    this.code = code;
    this.basic = basic;
    this.discount = discount;
  }

  public Order() {
  }

  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Double getBasic() {
    return basic;
  }

  public void setBasic(Double basic) {
    this.basic = basic;
  }

  public Double getDiscount() {
    return discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

}
