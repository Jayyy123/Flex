package com.jay.salesapp

import android.media.Image
import android.widget.ImageView
import androidx.annotation.DrawableRes

data class lists(
    var description: String,
    @DrawableRes val images: Int
)