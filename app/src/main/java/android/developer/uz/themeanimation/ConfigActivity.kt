package android.developer.uz.themeanimation

import android.developer.uz.themeanimation.preferences.LocalStorage
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_config.*

class ConfigActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_config)
        changeTheme()
        btn_continue.setOnClickListener { finish() }
    }

    private fun changeTheme() {
        when (LocalStorage.instance.theme) {
            "green" -> {
                btn_continue.setBackgroundResource(R.drawable.bggreen)
                textView4.text = "Green and Nature are friends!"
                iconTheme.setImageResource(R.drawable.ic_bear)
                changeNavigationBarColor(Color.parseColor("#19B1A5").toDarkenColor())
                changeStatusBarColor(Color.parseColor("#19B1A5").toDarkenColor())
            }
            "blue" -> {
                btn_continue.setBackgroundResource(R.drawable.bgblue)
                textView4.text = "The water is beautiful of blue"
                iconTheme.setImageResource(R.drawable.ic_blue)
                changeNavigationBarColor(Color.parseColor("#2764C7").toDarkenColor())
                changeStatusBarColor(Color.parseColor("#2764C7").toDarkenColor())
            }
            "purple" -> {
                btn_continue.setBackgroundResource(R.drawable.bgpurple)
                textView4.text = "Shiny even in the dark"
                iconTheme.setImageResource(R.drawable.ic_purple)
                changeNavigationBarColor(Color.parseColor("#B137C5").toDarkenColor())
                changeStatusBarColor(Color.parseColor("#B137C5").toDarkenColor())
            }
            else -> {
                btn_continue.setBackgroundResource(R.drawable.bgorange)
                textView4.text = "Orange is like a yellow"
                iconTheme.setImageResource(R.drawable.ic_orange)
                changeNavigationBarColor(Color.parseColor("#FE997D").toDarkenColor())
                changeStatusBarColor(Color.parseColor("#FE997D").toDarkenColor())
            }
        }
    }
}