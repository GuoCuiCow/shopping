package com.cuiguo.shopping.user.service

import com.cuiguo.shopping.user.mapper.UserMapper
import com.cuiguo.shopping.user.model.User
import lombok.extern.slf4j.Slf4j
import org.apache.ibatis.annotations.Param
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import javax.annotation.Resource


@Slf4j
@Service("userService")
class UserService {
    @Resource
    lateinit var userMapper: UserMapper

    fun getAll(): List<User> {
        return this.userMapper.getAll()
    }

    fun findByUserName(username: String): List<User> {
        return this.userMapper.findByUserName(username)
    }

    fun insert(username: String, password: String): Int {
        return this.userMapper.insert(username, password)
    }
}