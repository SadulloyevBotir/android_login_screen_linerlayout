package com.example.android_login_screen_linerlayout.model

import java.io.Serializable

data class User(var userId: String, var userPassword: String):Serializable {
    override fun toString(): String {
        return "userId = $userId, userPassword = $userPassword"
    }
}