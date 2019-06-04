package br.com.duduvp.cubos.test.ui.main

interface MainContract {

    interface View {
        fun initViews()
    }

    interface Presenter {
        fun listGenres()
        fun searchMovies()
    }

}