package br.com.duduvp.cubos.test.data.model

import com.google.gson.annotations.SerializedName

data class Genres(
    @SerializedName("id") private val id: Int,
    @SerializedName("name") private val name: String
)