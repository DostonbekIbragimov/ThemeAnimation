package android.developer.uz.themeanimation

import android.os.Build
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.changeStatusBarColor(color: Int){
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        window.statusBarColor = color
    }
}

fun AppCompatActivity.changeNavigationBarColor(color: Int){
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
        window.navigationBarColor = color
    }
}