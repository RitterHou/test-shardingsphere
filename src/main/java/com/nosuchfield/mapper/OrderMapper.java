package com.nosuchfield.mapper;

import com.nosuchfield.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface OrderMapper {

    void insert(Order order);

    List<Order> selectListByIds(@Param("idList") List<Long> idList);

}
