
package com.basedest.imagify.data

data class RandomUserResponse(
    val results: List<Result>
)

data class Result(
    val picture: Picture
)

data class Picture(
    val large: String
)