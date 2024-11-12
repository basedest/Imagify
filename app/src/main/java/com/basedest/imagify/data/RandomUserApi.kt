
package com.basedest.imagify.data

import retrofit2.http.GET

interface RandomUserApi {
    @GET("api/")
    suspend fun getRandomUser(): RandomUserResponse
}