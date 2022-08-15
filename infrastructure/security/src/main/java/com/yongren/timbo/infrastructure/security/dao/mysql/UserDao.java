package com.yongren.timbo.infrastructure.security.dao.mysql;

import com.yongren.timbo.infrastructure.security.entity.Role;
import com.yongren.timbo.infrastructure.security.entity.User;

public interface UserDao {

    User selectUserByCode(String code);

    boolean registerUser(User user, Role role);
}
