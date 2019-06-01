package com.cuiguo.shopping.user.controller

import com.cuiguo.shopping.user.model.User
import com.cuiguo.shopping.user.service.UserService
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import javax.annotation.Resource


@RestController
@RequestMapping("/user")
@Slf4j
class UserController {
    @Resource
    lateinit var userService: UserService

    @ResponseBody
    @RequestMapping(value = ["/getUsers"])
    fun getAll(): List<User> {
        return userService.getAll()
    }

    @ResponseBody
    @RequestMapping(value = ["/getByName"])
    fun findByUserName(username: String): List<User> {
        return userService.findByUserName(username)
    }

    @ResponseBody
    @RequestMapping(value = ["/register"])
    fun insert(username: String, password: String) {
        this.userService.insert(username, password)
    }

}