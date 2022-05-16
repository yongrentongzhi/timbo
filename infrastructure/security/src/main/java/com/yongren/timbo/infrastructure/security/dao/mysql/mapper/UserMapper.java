package com.yongren.timbo.infrastructure.security.dao.mysql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yongren.timbo.infrastructure.security.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 * @description 针对表【user】的数据库操作Mapper
 * @createDate 2022-05-15 01:32:35
 * @Entity com.yongren.timbo.infrastructure.entity.User
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




