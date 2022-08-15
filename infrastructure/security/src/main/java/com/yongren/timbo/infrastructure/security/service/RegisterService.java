package com.yongren.timbo.infrastructure.security.service;

import com.yongren.timbo.infrastructure.security.vo.ResultVo;
import com.yongren.timbo.infrastructure.security.vo.request.FormRegisterRvo;

public interface RegisterService {
    /**
     * 表单注册
     *
     * @return
     */
    ResultVo<?> registerViaForm(FormRegisterRvo registerRvo);
}
