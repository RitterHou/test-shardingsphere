package com.nosuchfield;

import com.nosuchfield.mapper.OrderMapper;
import com.nosuchfield.model.Order;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class OrderMapperTest extends BaseTest {

    @Autowired
    private OrderMapper orderMapper;

    @Test
    public void testInsert() {
        for (int i = 0; i < 10; i++) {
            Order order = new Order();
            order.setUserId(1L);
            order.setState(0);
            order.setTotalPrice(new BigDecimal((i + 1) * 5));
            order.setCreateTime(LocalDateTime.now());
            order.setUpdateTime(order.getCreateTime());
            this.orderMapper.insert(order);
        }
    }

}
