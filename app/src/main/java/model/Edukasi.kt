package com.example.prak_mobile_2407051030.model

import androidx.annotation.DrawableRes

data class Edukasi(
    val judul: String,
    val deskripsi: String,
    @DrawableRes val imageRes: Int
)