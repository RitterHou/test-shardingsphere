package com.nosuchfield.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Order {

    private String orderId;

    private Long userId;

    private BigDecimal totalPrice;

    private int state;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
