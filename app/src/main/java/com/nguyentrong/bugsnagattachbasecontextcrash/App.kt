package com.nguyentrong.bugsnagattachbasecontextcrash

import android.app.Application
import android.content.Context
import com.bugsnag.android.Bugsnag

class App: Application() {

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        Bugsnag.start(this)
    }

    override fun onCreate() {
        super.onCreate()
        // Bugsnag.start(this)
    }

}