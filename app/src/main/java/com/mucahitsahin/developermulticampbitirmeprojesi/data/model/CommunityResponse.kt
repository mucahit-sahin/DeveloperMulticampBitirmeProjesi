package com.mucahitsahin.developermulticampbitirmeprojesi.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Community(
    val name:String?,
    val description:String?,
    val banner:String?,
    val leader:leader?,
    val link:link?
)
@Serializable
data class leader(
    val name:String?,
    val photo:String?
)
@Serializable
data class link (
    val instagram:String?,
    val twitter:String?,
    val youtube:String?,
    val participation:String?
)