package com.nosuchfield.shardingsphere.mapper;

import com.nosuchfield.shardingsphere.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO t_user(id, name, phone, address) VALUES (#{id}, #{name}, #{phone}, #{address})")
    void save(User user);

    @Select("SELECT * FROM t_user")
    List<User> query();

}
