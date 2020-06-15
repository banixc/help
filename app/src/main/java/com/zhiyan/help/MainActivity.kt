package com.zhiyan.help

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import cn.jpush.android.api.JPushInterface

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        JPushInterface.setDebugMode(true)
        JPushInterface.init(this)

        Log.d("getRegistrationID", JPushInterface.getRegistrationID(this))
    }
}