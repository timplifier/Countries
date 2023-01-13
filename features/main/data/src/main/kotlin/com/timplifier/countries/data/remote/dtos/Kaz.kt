package com.timplifier.countries.data.remote.dtos


import com.google.gson.annotations.SerializedName

data class Kaz(
    @SerializedName("official")
    val official: String,
    @SerializedName("common")
    val common: String
)