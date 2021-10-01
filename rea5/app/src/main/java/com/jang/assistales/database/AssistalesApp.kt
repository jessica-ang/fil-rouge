package com.jang.assistales.database

import android.app.Application

lateinit var applicationInstance: AssistalesApp

class AssistalesApp : Application() {
    val database by lazy { SheetDatabase.getDatabase(this) }
    override fun onCreate() {
        super.onCreate()
        applicationInstance = this
    }
}