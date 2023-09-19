package com.example.odev.datamodel

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class customModel(
    val infoModel: infoModel,
    val sehir : String,
    val okul : String,
    val bolum : String
):Parcelable
