package org.jxch.capital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jxch.capital.dao.UserRoleDao;
import org.jxch.capital.entity.UserRoleDO;
import org.jxch.capital.service.UserRoleService;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRoleDO> implements UserRoleService {
}
