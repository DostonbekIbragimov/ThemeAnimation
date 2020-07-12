package android.developer.uz.themeanimation.preferences

import android.content.Context

class LocalStorage private constructor(context: Context) {
    companion object {
        lateinit var instance: LocalStorage; private set

        fun init(context: Context) {
            instance =
                LocalStorage(context)
        }
    }

    private val pref = context.getSharedPreferences("dostonbek", Context.MODE_PRIVATE)

    var theme: String
        set(value) {
            val e = pref.edit()
            e.putString("theme", value)
            e.apply()
        }
        get() = pref.getString("theme", "")!!

    fun clear() {
        pref.edit().clear().apply()
    }
}