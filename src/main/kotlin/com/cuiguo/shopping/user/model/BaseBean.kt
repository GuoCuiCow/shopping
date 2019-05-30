package com.cuiguo.shopping.user.model

import java.io.Serializable
import java.util.*
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor


import java.util.Date


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
open class BaseBean : Serializable {
    open var id: Long? = -1

    open var createTime: Date? = Date()

    open var updateTime: Date? = Date()
}