package com.springapp.foundation.database;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Description
 * Created by xu bin on 2015-04-26.
 */
public interface UserMapper {
    @Select("select * from nor_user where id = #{userId}")
    UserMapperBean selectUserById(@Param("userId")long id);
}
