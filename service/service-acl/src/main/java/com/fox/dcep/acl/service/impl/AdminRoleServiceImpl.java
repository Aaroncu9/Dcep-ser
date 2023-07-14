package com.fox.dcep.acl.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fox.dcep.acl.mapper.AdminRoleMapper;
import com.fox.dcep.acl.service.AdminRoleService;
import com.fox.dcep.model.acl.AdminRole;
import org.springframework.stereotype.Service;

@Service
public class AdminRoleServiceImpl extends ServiceImpl<AdminRoleMapper, AdminRole> implements AdminRoleService {
}
