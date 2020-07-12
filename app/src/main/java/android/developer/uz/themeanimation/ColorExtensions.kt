package android.developer.uz.themeanimation

import android.content.res.ColorStateList
import android.graphics.Color
import android.widget.ImageView
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.core.widget.ImageViewCompat

fun Int.toDarkenColor(): Int {
    val hsv = FloatArray(3)
    Color.colorToHSV(this, hsv)
    hsv[2] *= 0.8f
    return Color.HSVToColor(hsv)
}

fun ImageView.setTint(@ColorRes colorRes: Int) {
    ImageViewCompat.setImageTintList(this, ColorStateList.valueOf(ContextCompat.getColor(context, colorRes)))
}