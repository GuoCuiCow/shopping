package com.cuiguo.shopping


import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
@MapperScan("com.cuiguo.shopping.user.mapper")
class ShoppingApplication
    fun main(args: Array<String>) {
        runApplication<ShoppingApplication>(*args)
    }



