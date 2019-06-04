package br.com.duduvp.cubos.test.data.api

import br.com.duduvp.cubos.test.data.model.dto.GenresDTO
import retrofit2.Call
import retrofit2.http.GET

interface TheMovieDatabaseApiDef {

    @GET("genres")
    fun getGenres(): Call<GenresDTO>

}