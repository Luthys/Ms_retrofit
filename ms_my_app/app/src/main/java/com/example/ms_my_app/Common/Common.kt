package com.example.ms_my_app.Common

import com.example.ms_my_app.Interface.RetrofitService
import com.example.ms_my_app.Retrofit.RetrofitClient

object Common {
    private var BASE_URL = "http://simplifiedcoding.net/demos/"

    val retrofitService: RetrofitService
    get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}