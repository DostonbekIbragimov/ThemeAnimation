package android.developer.uz.themeanimation

import android.content.Context
import android.content.Intent
import android.developer.uz.themeanimation.preferences.LocalStorage
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val SHARED_PREFS = "codeTheme"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //change navigation bar and status bar color
        changeNavigationBarColor(Color.parseColor("#19B1A5").toDarkenColor())
        changeStatusBarColor(Color.parseColor("#19B1A5").toDarkenColor())


        holder_bg.setBackgroundResource(R.drawable.bggreen)
        holder_bg.scaleX = 3F
        holder_bg.scaleY = 3F
        btn_green.scaleX = 1.5F
        btn_green.scaleY = 1.5F

        //save to local storage(default)
        LocalStorage.instance.theme = "green"

        btn_save.setOnClickListener {
            startActivity(Intent(this, ConfigActivity::class.java))
        }
        //set function of changing theme
        btn_blue.setOnClickListener {
            //scale animation
            btn_blue.animate().scaleX(1.5F).scaleY(1.5F).setDuration(350).start()

            //default the scale buttons
            btn_green.animate().translationY(0f).scaleX(1F).scaleY(1F).setDuration(350).start()
            btn_purple.animate().translationY(0f).scaleX(1F).scaleY(1F).setDuration(350).start()
            btn_orange.animate().translationY(0f).scaleX(1F).scaleY(1F).setDuration(350).start()

            //change the background
            dynamic_bg.setBackgroundResource(R.drawable.bgblue)
            dynamic_bg.animate().scaleX(3F).scaleY(3F).setDuration(800).start()
            btn_save.setTextColor(Color.parseColor("#3498DB"))
            changeNavigationBarColor(Color.parseColor("#2764C7").toDarkenColor())
            changeStatusBarColor(Color.parseColor("#2764C7").toDarkenColor())


            //save to local storage
            LocalStorage.instance.theme = "blue"


            //time for change the holder_bg
            val handler = Handler()
            handler.postDelayed({
                holder_bg.scaleX = 3f
                holder_bg.scaleY = 3f
                holder_bg.setBackgroundResource(R.drawable.bgblue)
                dynamic_bg.scaleX = 0f
                dynamic_bg.scaleY = 0f
            }, 850)
        }

        btn_green.setOnClickListener {
            //scale animation
            btn_green.animate().scaleX(1.5F).scaleY(1.5F).setDuration(350).start()

            //default the scale buttons
            btn_blue.animate().translationY(0F).scaleX(1F).scaleY(1F).setDuration(350).start()
            btn_purple.animate().translationY(0F).scaleX(1F).scaleY(1F).setDuration(350).start()
            btn_orange.animate().translationY(0F).scaleX(1F).scaleY(1F).setDuration(350).start()

            //change the background
            dynamic_bg.setBackgroundResource(R.drawable.bggreen)
            dynamic_bg.animate().scaleX(3F).scaleY(3F).setDuration(800).start()
            btn_save.setTextColor(Color.parseColor("#1BAC9C"))
            changeNavigationBarColor(Color.parseColor("#19B1A5").toDarkenColor())
            changeStatusBarColor(Color.parseColor("#19B1A5").toDarkenColor())

            //save to local storage
            LocalStorage.instance.theme = "green"

            //time for change the holder_bg
            val handler = Handler()
            handler.postDelayed({
                holder_bg.scaleX = 3f
                holder_bg.scaleY = 3f
                holder_bg.setBackgroundResource(R.drawable.bggreen)
                dynamic_bg.scaleX = 0f
                dynamic_bg.scaleY = 0f
            }, 850)
        }

        btn_purple.setOnClickListener {
            //scale animation
            btn_purple.animate().scaleX(1.5F).scaleY(1.5F).setDuration(350)
                .start()

            //default the scale buttons
            btn_green.animate().translationY(0f).scaleX(1F).scaleY(1F).setDuration(350).start()
            btn_blue.animate().translationY(0f).scaleX(1F).scaleY(1F).setDuration(350).start()
            btn_orange.animate().translationY(0f).scaleX(1F).scaleY(1F).setDuration(350).start()

            //change the background
            dynamic_bg.setBackgroundResource(R.drawable.bgpurple)
            dynamic_bg.animate().scaleX(3F).scaleY(3F).setDuration(800).start()
            btn_save.setTextColor(Color.parseColor("#E03FA2"))
            changeNavigationBarColor(Color.parseColor("#B137C5").toDarkenColor())
            changeStatusBarColor(Color.parseColor("#B137C5").toDarkenColor())

            //save to local storage
            LocalStorage.instance.theme = "purple"

            //time for change the holder_bg
            val handler = Handler()
            handler.postDelayed({
                holder_bg.scaleX = 3f
                holder_bg.scaleY = 3f
                holder_bg.setBackgroundResource(R.drawable.bgpurple)
                dynamic_bg.scaleX = 0f
                dynamic_bg.scaleY = 0f
            }, 850)
        }

        btn_orange.setOnClickListener {
            //scale animation
            btn_orange.animate().scaleX(1.5F).scaleY(1.5F).setDuration(350)
                .start()

            //default the scale buttons
            btn_green.animate().translationY(0f).scaleX(1F).scaleY(1F).setDuration(350).start()
            btn_purple.animate().translationY(0f).scaleX(1F).scaleY(1F).setDuration(350).start()
            btn_blue.animate().translationY(0f).scaleX(1F).scaleY(1F).setDuration(350).start()

            //change the background
            dynamic_bg.setBackgroundResource(R.drawable.bgorange)
            dynamic_bg.animate().scaleX(3F).scaleY(3F).setDuration(800).start()
            btn_save.setTextColor(Color.parseColor("#FF8D7E"))

            //save to local storage
            LocalStorage.instance.theme = "orange"

            //time for change the holder_bg
            val handler = Handler()
            handler.postDelayed({
                holder_bg.scaleX = 3f
                holder_bg.scaleY = 3f
                holder_bg.setBackgroundResource(R.drawable.bgorange)
                dynamic_bg.scaleX = 0f
                dynamic_bg.scaleY = 0f
            }, 850)

            changeNavigationBarColor(Color.parseColor("#FE997D").toDarkenColor())
            changeStatusBarColor(Color.parseColor("#FE997D").toDarkenColor())
        }
    }
}