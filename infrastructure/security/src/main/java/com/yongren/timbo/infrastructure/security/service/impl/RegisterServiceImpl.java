package com.yongren.timbo.infrastructure.security.service.impl;

import com.yongren.timbo.infrastructure.security.dao.mysql.UserDao;
import com.yongren.timbo.infrastructure.security.service.RegisterService;
import com.yongren.timbo.infrastructure.security.vo.ResultVo;
import com.yongren.timbo.infrastructure.security.vo.request.FormRegisterRvo;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {


    private final UserDao userDao;

    public RegisterServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 表单注册
     *
     * @param registerRvo 表单请求对象
     */
    @Override
    public ResultVo<?> registerViaForm(FormRegisterRvo registerRvo) {


        return null;
    }
}
