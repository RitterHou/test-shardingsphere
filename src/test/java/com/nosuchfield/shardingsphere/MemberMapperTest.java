package com.nosuchfield.shardingsphere;

import com.nosuchfield.shardingsphere.mapper.MemberMapper;
import com.nosuchfield.shardingsphere.model.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class MemberMapperTest extends BaseTest {

    @Autowired
    private MemberMapper memberMapper;

    @Test
    public void testSave() {
        memberMapper.save(Member.builder()
                .name("张三")
                .password("123456").build());
    }

    @Test
    public void testQuery() {
        List<Member> members = memberMapper.query();
        log.info(members.toString());
    }

}
