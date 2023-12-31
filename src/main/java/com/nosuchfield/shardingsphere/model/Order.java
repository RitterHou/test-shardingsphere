package com.nosuchfield.shardingsphere.model;

import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@ToString
public class Order {

    private String id;

    private String orderId;

    private Long userId;

    private BigDecimal totalPrice;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
