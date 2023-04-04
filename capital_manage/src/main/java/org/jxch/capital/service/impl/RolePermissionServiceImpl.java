package org.jxch.capital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jxch.capital.dao.RolePermissionDao;
import org.jxch.capital.entity.RolePermissionDO;
import org.jxch.capital.service.RolePermissionService;
import org.springframework.stereotype.Service;

@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionDao, RolePermissionDO> implements RolePermissionService {
}
