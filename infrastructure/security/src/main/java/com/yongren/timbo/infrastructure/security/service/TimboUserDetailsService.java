package com.yongren.timbo.infrastructure.security.service;

import com.yongren.timbo.infrastructure.security.dao.mysql.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class TimboUserDetailsService implements UserDetailsService {

    private final UserDao userDao;

    @Autowired
    public TimboUserDetailsService(UserDao userDao) {

        this.userDao = userDao;
    }


    /**
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails user = userDao.selectUserByCode(username);
        if (user == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        return user;
    }
}
