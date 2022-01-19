package com.wills.mybatisplugin.mapper;

import com.wills.mybatisplugin.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @ClassName UserMapper
 * @Date 2022/1/13 14:14
 * @Author 王帅
 * @Version 1.0
 * @Description
 */
@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{userId}")
    public User getOneById(@Param("userId") Integer userId);


    @Insert("insert into user(name,age) values(#{user.name},#{user.age})")
    void save(@Param("user") User user);
}
