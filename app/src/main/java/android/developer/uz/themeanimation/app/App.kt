package android.developer.uz.themeanimation.app

import android.app.Application
import android.developer.uz.themeanimation.preferences.LocalStorage

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        instance = this
        LocalStorage.init(this)
    }

    companion object {
        lateinit var instance: App
    }
}