package com.bravedroid.boilerplate.app

import android.os.StrictMode
import com.facebook.stetho.Stetho
import timber.log.Timber


class App : AbstractApp() {
    override fun initDebuggingTools() {
        Stetho.initializeWithDefaults(this)
        Timber.plant(Timber.DebugTree())
        enabledStrictMode()
    }

    private fun enabledStrictMode() {
        StrictMode.setThreadPolicy(
            StrictMode.ThreadPolicy.Builder()
                .detectAll()
                .penaltyLog()
                .penaltyDeath()
                .build()
        )
    }
}
