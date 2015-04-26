package com.springapp.foundation.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description
 * Created by xubin on 2015-04-26.
 */
@Service("userService")
public class UserDaoImpl implements UserDao {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserMapperBean selectUserById(UserMapperBean user) {
        return userMapper.selectUserById(user.getId());
    }
}
