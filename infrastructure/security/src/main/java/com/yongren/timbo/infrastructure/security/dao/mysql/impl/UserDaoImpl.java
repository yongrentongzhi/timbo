package com.yongren.timbo.infrastructure.security.dao.mysql.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.yongren.timbo.infrastructure.security.dao.mysql.UserDao;
import com.yongren.timbo.infrastructure.security.dao.mysql.mapper.RoleMapper;
import com.yongren.timbo.infrastructure.security.dao.mysql.mapper.UserMapper;
import com.yongren.timbo.infrastructure.security.dao.mysql.mapper.UserRoleMapper;
import com.yongren.timbo.infrastructure.security.entity.Role;
import com.yongren.timbo.infrastructure.security.entity.User;
import com.yongren.timbo.infrastructure.security.entity.UserRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    private final UserMapper userMapper;

    private final RoleMapper roleMapper;

    private final UserRoleMapper userRoleMapper;

    @Autowired
    public UserDaoImpl(UserMapper userMapper, RoleMapper roleMapper, UserRoleMapper userRoleMapper) {
        this.userMapper = userMapper;
        this.roleMapper = roleMapper;
        this.userRoleMapper = userRoleMapper;
    }


    @Override
    public User selectUserByCode(String code) {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("code", code);
        User user = userMapper.selectOne(queryWrapper);
        QueryWrapper<UserRole> userRoleQueryWrapper = new QueryWrapper<>();
        userRoleQueryWrapper.eq("user_id", user.getId());
        List<UserRole> userRoleList = userRoleMapper.selectList(userRoleQueryWrapper);
        List<Integer> roleIdList = new ArrayList<>();
        for (UserRole userRole : userRoleList) {
            roleIdList.add(userRole.getRole_id());
        }
        List<Role> roles = roleMapper.selectBatchIds(roleIdList);
        user.setRoleList(roles);
        return user;
    }

    @Override
    public boolean registerUser(User user, Role role) {
        return false;
    }
}
