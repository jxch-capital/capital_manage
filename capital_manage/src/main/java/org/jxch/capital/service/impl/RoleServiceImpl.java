package org.jxch.capital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jxch.capital.dao.RoleDao;
import org.jxch.capital.entity.RoleDO;
import org.jxch.capital.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao, RoleDO> implements RoleService {
}
