package com.cuiguo.shopping.user.model


data class User(
        var username: String = "",
        var phone: String = "",
        var password: String = ""
) : BaseBean()