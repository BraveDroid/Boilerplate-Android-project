package com.bravedroid.boilerplate.app

import android.util.Log
import com.bravedroid.boilerplate.BuildConfig
import timber.log.Timber

class App : AbstractApp() {
    override fun initDebuggingTools() {
        if (BuildConfig.DEBUG)
            Timber.plant(Timber.DebugTree())
        else
            Timber.plant(CrashReportingTree())

    }
}


private class CrashReportingTree : Timber.Tree() {
    override fun log(
        priority: Int,
        tag: String?, message: String,
        t: Throwable?
    ) {
        if (priority == Log.VERBOSE || priority == Log.DEBUG) {
            return
        }
        FakeCrashLibrary.log(
            priority,
            tag,
            message
        )
        if (t != null) {
            if (priority == Log.ERROR) {
                FakeCrashLibrary.logError(
                    t
                )
            } else if (priority == Log.WARN) {
                FakeCrashLibrary.logWarning(
                    t
                )
            }
        }
    }
}

/** Not a real crash reporting library!  */
private class FakeCrashLibrary {
    companion object {
        fun log(
            priority: Int,
            tag: String?,
            message: String?
        ) {
        }

        fun logWarning(t: Throwable?) {
        }

        fun logError(t: Throwable?) {
        }
    }
}
