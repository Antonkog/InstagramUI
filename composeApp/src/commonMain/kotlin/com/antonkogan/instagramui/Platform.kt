package com.antonkogan.instagramui

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform