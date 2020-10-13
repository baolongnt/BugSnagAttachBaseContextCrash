package com.nguyentrong.bugsnagattachbasecontextcrash

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bugsnag.android.Bugsnag

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}