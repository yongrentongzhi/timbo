package com.yongren.timbo.infrastructure.security.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @TableName user_role
 */
@TableName(value = "user_role")
public class UserRole implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
    /**
     *
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
    /**
     *
     */
    @TableField(value = "user_id")
    private Integer user_id;
    /**
     *
     */
    @TableField(value = "role_id")
    private Integer role_id;

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
     *
     */
    public Integer getUser_id() {
        return user_id;
    }

    /**
     *
     */
    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    /**
     *
     */
    public Integer getRole_id() {
        return role_id;
    }

    /**
     *
     */
    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }
}