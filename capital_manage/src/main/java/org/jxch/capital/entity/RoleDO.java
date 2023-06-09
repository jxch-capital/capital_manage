package org.jxch.capital.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors(chain = true)
@TableName("role")
public class RoleDO implements Serializable {
    @TableId
    private Long id;
    private String roleName;
    private String roleDesc;
}
