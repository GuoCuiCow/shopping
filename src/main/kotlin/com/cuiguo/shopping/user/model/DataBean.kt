package com.cuiguo.shopping.user.model

data class DataBean<T>(
        var code: Int = 200,
        var data: T,
        var msg: String = "请求成功"
)