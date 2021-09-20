package com.example.herb_teas.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Teas (
    var name: String = "",
    var detail: String = "",
    var img: Int = 0
) : Parcelable
