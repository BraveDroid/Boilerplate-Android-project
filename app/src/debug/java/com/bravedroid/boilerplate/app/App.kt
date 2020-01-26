package com.bravedroid.boilerplate.app

import android.os.StrictMode
import com.facebook.stetho.Stetho
import timber.log.Timber


class App : BaseApp() {
    override fun initDebuggingTools() {
        enabledStrictMode()
        Stetho.initializeWithDefaults(this)
        Timber.plant(Timber.DebugTree())
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
