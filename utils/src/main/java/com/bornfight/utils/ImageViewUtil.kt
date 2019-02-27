@file:kotlin.jvm.JvmName("ImageViewUtil")
@file:kotlin.jvm.JvmMultifileClass

package com.bornfight.utils

import android.graphics.ColorMatrix
import android.graphics.ColorMatrixColorFilter
import android.widget.ImageView

/**
 * Created by tomislav on 10/05/2017.
 */

/**
 * Sets the saturation to 0.
 */
fun ImageView.setBlackWhite(imageView: ImageView) {
    val matrix = ColorMatrix()
    matrix.setSaturation(0f)

    val filter = ColorMatrixColorFilter(matrix)
    imageView.colorFilter = filter
}

