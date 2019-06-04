package com.cuiguo.shopping.user.service

import com.cuiguo.shopping.user.mapper.UserMapper
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service


@Slf4j
@Service("userService")
class UserService {
    @Autowired
    lateinit var userMapper: UserMapper

    fun save(username: String,password : String):Int{
        return userMapper.insert(username, password)
    }
}