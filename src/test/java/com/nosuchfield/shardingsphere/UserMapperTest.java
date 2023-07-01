package com.nosuchfield.shardingsphere;

import com.nosuchfield.shardingsphere.mapper.UserMapper;
import com.nosuchfield.shardingsphere.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
public class UserMapperTest extends BaseTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testInsert() {
        userMapper.save(User.builder()
                .id("888")
                .name("小明")
                .phone("13866688888")
                .address("江苏省南京市").build());
    }

    @Test
    public void testQuery() {
        for (int i = 0; i < 10; i++) {
            List<User> users = userMapper.query();
            log.info(users.toString());
        }
    }

}
