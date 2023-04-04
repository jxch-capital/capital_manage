package org.jxch.capital.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.jxch.capital.entity.UserDO;

@Mapper
public interface UserDao extends BaseMapper<UserDO> {
}
