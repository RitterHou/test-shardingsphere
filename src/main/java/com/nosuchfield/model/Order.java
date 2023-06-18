package com.nosuchfield.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Order {

    private String orderId;

    private String userId;

    private BigDecimal totalPrice;

    private int status;

    private Date createTime;

    private Date updateTime;

}
