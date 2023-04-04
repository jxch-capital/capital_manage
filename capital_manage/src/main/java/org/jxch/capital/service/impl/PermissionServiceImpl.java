package org.jxch.capital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jxch.capital.dao.PermissionDao;
import org.jxch.capital.entity.PermissionDO;
import org.jxch.capital.service.PermissionService;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionDao, PermissionDO> implements PermissionService {
}
