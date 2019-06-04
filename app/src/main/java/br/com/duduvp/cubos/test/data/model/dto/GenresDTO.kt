package br.com.duduvp.cubos.test.data.model.dto

import br.com.duduvp.cubos.test.data.model.Genres
import com.google.gson.annotations.SerializedName

data class GenresDTO(@SerializedName("genres") private val genres: List<Genres>)