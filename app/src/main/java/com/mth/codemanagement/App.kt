package com.mth.codemanagement

import android.app.Application
import com.mth.codemanagement.di.AppComponent



open class App : Application() {

    val appComponent: AppComponent by lazy {
        initializeComponent()
    }

    open fun initializeComponent(): AppComponent {
        return DaggerAppComponent.factory().create(applicationContext)
    }

}