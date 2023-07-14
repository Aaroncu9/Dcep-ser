package com.fox.dcep.model.acl;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fox.dcep.model.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author : Aaron
 * @since : Created in 16:42 2023/7/13
 */
@Data
@ApiModel(description = "用户")
@TableName("admin")
public class Admin extends BaseEntity {

	private static final long serialVersionUID = 1L;

	@ApiModelProperty(value = "用户名")
	@TableField("username")
	private String username;

	@ApiModelProperty(value = "密码")
	@TableField("password")
	private String password;

	@ApiModelProperty(value = "昵称")
	@TableField("name")
	private String name;

	@ApiModelProperty(value = "手机")
	@TableField("phone")
	private String phone;

	@ApiModelProperty(value = "仓库id")
	@TableField("ware_id")
	private Long wareId;

	@ApiModelProperty(value = "角色名称")
	@TableField(exist = false)
	private String roleName;
}



