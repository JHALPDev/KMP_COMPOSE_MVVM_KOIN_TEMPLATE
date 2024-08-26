package com.jhalpdev.kmpcomposetemplate

import android.app.Application
import com.jhalpdev.kmpcomposetemplate.di.initKoin
import org.koin.android.ext.koin.androidContext

class AndroidApp:Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@AndroidApp)
        }
    }
}