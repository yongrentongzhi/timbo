package com.yongren.timbo.infrastructure.security.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @TableName role_resource
 */
@TableName(value = "role_resource")
public class RoleResource implements Serializable {
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
    @TableField(value = "role_id")
    private Integer role_id;
    /**
     *
     */
    @TableField(value = "resource_id")
    private Integer resource_id;

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
    public Integer getRole_id() {
        return role_id;
    }

    /**
     *
     */
    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    /**
     *
     */
    public Integer getResource_id() {
        return resource_id;
    }

    /**
     *
     */
    public void setResource_id(Integer resource_id) {
        this.resource_id = resource_id;
    }
}