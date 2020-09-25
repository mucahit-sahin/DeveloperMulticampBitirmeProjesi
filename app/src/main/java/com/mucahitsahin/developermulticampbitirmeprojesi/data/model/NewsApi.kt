package com.mucahitsahin.developermulticampbitirmeprojesi.data.model

import retrofit2.http.GET

interface NewsApi {
    @GET("communities")
    suspend fun getCommunities():List<Community>?
}