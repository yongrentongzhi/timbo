package com.yongren.timbo.infrastructure.security.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @TableName user
 */
@TableName(value = "user")
public class User implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     * 昵称
     */
    @TableField(value = "name")
    private String name;
    /**
     *
     */
    @TableField(value = "code")
    private String code;
    /**
     * 密码
     */
    @TableField(value = "password")
    private String password;

    /**
     *
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 昵称
     */
    public String getName() {
        return name;
    }

    /**
     * 昵称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     */
    public String getCode() {
        return code;
    }

    /**
     *
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }
}