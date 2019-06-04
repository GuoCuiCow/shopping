package com.cuiguo.shopping.user.mapper

import com.cuiguo.shopping.user.model.User
import org.apache.ibatis.annotations.*

@Mapper
interface UserMapper {
    @Select("SELECT * FROM users")
    fun getAll(): List<User>

    @Select("SELECT * FROM USER WHERE USERNAME = #{username}")
    fun findByUserName(@Param("username") username: String): List<User>

    @Insert("INSERT INTO USER(USERNAME, PASSWORD) VALUES(#{username}, #{password})")
    fun insert(@Param("username") username: String, @Param("password") password: String): Int
}