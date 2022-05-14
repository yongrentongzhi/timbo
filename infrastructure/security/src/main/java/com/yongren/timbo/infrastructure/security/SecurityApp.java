package com.yongren.timbo.infrastructure.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yongren.timbo.infrastructure.security.mapper")
public class SecurityApp {
}
