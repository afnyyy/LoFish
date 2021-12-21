package com.afny.lofish3

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Image(
    val imgSrc: Int,
    val imgTittle: String,
    val imgDesc: String
) :Parcelable

