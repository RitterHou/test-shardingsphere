package com.nosuchfield.shardingsphere.mapper;

import com.nosuchfield.shardingsphere.model.Member;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {

    @Insert("INSERT INTO t_member(name, password) VALUES (#{name}, #{password})")
    void save(Member member);

    @Select("SELECT * FROM t_member")
    List<Member> query();

}
