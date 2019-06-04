package com.cuiguo.shopping.user.mapper

import com.cuiguo.shopping.user.model.User
import org.apache.ibatis.annotations.*

@Mapper
interface UserMapper {

    fun getAll(): List<User>

    @Select("Select * from user where name = '#{username}'")
    fun findByUserName(@Param("username") username: String): List<User>

    @Insert("INSERT INTO user(username,password) VALUES(#{username}, #{password}")
    fun insert(username: String,password: String): Int
}