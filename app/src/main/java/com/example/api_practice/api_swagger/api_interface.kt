package com.example.api_practice.api_swagger

import com.example.api_practice.model.model_Respond
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query


interface api_interface {

    @GET("movie/top_rated")
    public fun getTopList (@Query("api" )api : Int) : Observable<model_Respond>
}