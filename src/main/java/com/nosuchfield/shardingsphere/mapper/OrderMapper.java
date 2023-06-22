package com.nosuchfield.shardingsphere.mapper;

import com.nosuchfield.shardingsphere.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface OrderMapper {

    void insert(Order order);

    List<Order> selectListByIds(@Param("idList") List<Long> idList);

    @Select("SELECT * FROM t_order")
    List<Order> getAllOrders();

}
