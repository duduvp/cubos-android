package br.com.duduvp.cubos.test.data.api

import br.com.duduvp.cubos.test.data.model.dto.GenresDTO
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class TheMovieDatabaseApi : TheMovieDatabaseApiDef {

    private val service : TheMovieDatabaseApiDef
    private val apiKey = "d16e42cec4b4a8068a2543993141d5d8"

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(TheMovieDatabaseApiDef::class.java)
    }

    override fun getGenres(): Call<GenresDTO> {
        return service.getGenres()
    }

}