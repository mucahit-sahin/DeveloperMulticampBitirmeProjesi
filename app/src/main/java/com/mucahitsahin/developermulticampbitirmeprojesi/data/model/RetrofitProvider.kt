package com.mucahitsahin.developermulticampbitirmeprojesi.data.model

import retrofit2.Retrofit
import retrofit2.create

object RetrofitProvider {
    val retrofit:Retrofit= Retrofit.Builder()
        .baseUrl("https://5f6642a143662800168e7538.mockapi.io/multicamp/")
        .build()

    val newsApi= retrofit.create<NewsApi>()
}