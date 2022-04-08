package com.example.android_login_screen_linerlayout.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.android_login_screen_linerlayout.R
import com.example.android_login_screen_linerlayout.model.User

class MainActivity : AppCompatActivity() {
    private var et_user_id: EditText? = null
    private var et_user_pw: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        et_user_id = findViewById(R.id.et_user_id)
        et_user_pw = findViewById(R.id.et_user_pw)
        var bn_login = findViewById<Button>(R.id.bn_login)


        bn_login.setOnClickListener {
            //This part for task 3
            var userId = et_user_id!!.text.toString().trim()
            var userPassword = et_user_pw!!.text.toString().trim()
            var user = User(userId, userPassword)

            callSecondActivity(user)
        }

    }

    //This part for task 3
    private fun callSecondActivity(user: User) {
        var intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("user", user)
        startActivity(intent)
    }

}