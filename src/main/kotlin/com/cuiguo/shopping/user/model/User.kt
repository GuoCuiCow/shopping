package com.cuiguo.shopping.user.model

import org.joda.money.Money


data class User(
        var name: String = "",
        var phone: String = ""
) : BaseBean()