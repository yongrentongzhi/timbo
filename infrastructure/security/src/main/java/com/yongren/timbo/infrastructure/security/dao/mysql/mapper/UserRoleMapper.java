package com.yongren.timbo.infrastructure.security.dao.mysql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yongren.timbo.infrastructure.security.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author Administrator
 * @description 针对表【user_role】的数据库操作Mapper
 * @createDate 2022-05-15 01:32:35
 * @Entity com.yongren.timbo.infrastructure.entity.UserRole
 */
@Mapper
public interface UserRoleMapper extends BaseMapper<UserRole> {

}




