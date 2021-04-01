package com.example.retrofitapi.network

import com.example.retrofitapi.model.Android
import io.reactivex.Observable
import retrofit2.http.GET

interface RequestInterface {

    @GET("api/android")
    fun getData() : Observable<List<Android>>

}