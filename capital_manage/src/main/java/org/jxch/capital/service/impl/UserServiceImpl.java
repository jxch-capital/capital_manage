package org.jxch.capital.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.jxch.capital.dao.UserDao;
import org.jxch.capital.entity.UserDO;
import org.jxch.capital.service.UserService;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserDO> implements UserService {
}
