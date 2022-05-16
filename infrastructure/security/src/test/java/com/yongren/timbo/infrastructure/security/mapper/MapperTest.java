package com.yongren.timbo.infrastructure.security.mapper;

import com.yongren.timbo.infrastructure.security.dao.mysql.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.Assert;

@SpringBootTest
@ExtendWith(SpringExtension.class)
public class MapperTest {
    @Autowired
    UserMapper userMapper;

    @Test
    public void userMapper_notNull() {

        Assert.notNull(userMapper, "userMapper为null");
    }
}
