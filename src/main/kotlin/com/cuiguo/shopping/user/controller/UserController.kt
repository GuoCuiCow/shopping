package com.cuiguo.shopping.user.controller

import com.cuiguo.shopping.user.service.UserService
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/user")
@Slf4j
class UserController {
    @Autowired
    lateinit var userService: UserService

    @PostMapping(path = ["/"], consumes = [MediaType.APPLICATION_FORM_URLENCODED_VALUE])
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    fun register(username: String,password : String) {
        userService.save(username, password)
    }
}