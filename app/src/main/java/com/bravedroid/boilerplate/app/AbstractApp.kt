package com.bravedroid.boilerplate.app

import android.app.Application
import android.os.SystemClock
import timber.log.Timber

abstract class AbstractApp : Application() {
    override fun onCreate() {
        super.onCreate()
        val startTime = SystemClock.elapsedRealtime()
        initDebuggingTools()
        val elapsed = SystemClock.elapsedRealtime() - startTime
        Timber.i("app debugging tools initialized in $elapsed ms")
    }

    abstract fun initDebuggingTools()
}
