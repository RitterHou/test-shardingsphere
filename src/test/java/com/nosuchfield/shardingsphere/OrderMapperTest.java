package com.nosuchfield.shardingsphere;

import com.nosuchfield.shardingsphere.mapper.OrderMapper;
import com.nosuchfield.shardingsphere.model.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderMapperTest extends BaseTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testInsert() {
        for (int i = 0; i < 30; i++) {
            Order order = new Order();
            order.setOrderId("66666666666");
            order.setUserId(1L);
            order.setTotalPrice(new BigDecimal((i + 1) * 5));
            order.setCreateTime(LocalDateTime.now());
            order.setUpdateTime(order.getCreateTime());
            this.orderMapper.insert(order);
        }
    }

}
