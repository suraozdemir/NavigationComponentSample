package com.example.odev.datamodel

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class infoModel(
    val name : String,
    val email : String,
    val phone : Int
):Parcelable
