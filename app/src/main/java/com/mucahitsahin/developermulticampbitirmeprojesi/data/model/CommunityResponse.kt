package com.mucahitsahin.developermulticampbitirmeprojesi.data.model

data class CommunityResponse(val ClubList: List<Community>)

data class Community(
    val name:String?,
    val description:String?,
    val banner:String?,
    val leader:leader?,
    val link:link?
)

data class leader(
    val name:String?,
    val photo:String?
)

data class link (
    val instagram:String?,
    val twitter:String?,
    val youtube:String?,
    val participation:String?
)