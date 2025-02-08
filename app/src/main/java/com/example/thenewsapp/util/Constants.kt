package com.example.thenewsapp.util

import com.example.thenewsapp.BuildConfig

class Constants {
    companion object {
        const val API_KEY = BuildConfig.NEWS_API_KEY
        const val BASE_URL = "https://newsapi.org/"
        const val SEARCH_NEWS_TIME_DELAY = 500L
        const val QUERY_PAGE_SIZE = 20
    }
}