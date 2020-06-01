package com.example.dice_roller_remake

import android.app.Application
import timber.log.Timber

class ClickerApplication:Application() {
    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}