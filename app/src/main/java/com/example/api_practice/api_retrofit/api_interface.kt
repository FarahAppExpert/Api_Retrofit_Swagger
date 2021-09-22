package com.example.api_practice.api_retrofit

import android.database.Observable
import com.example.api_practice.model.model
import com.example.api_practice.model.model_Respond
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import retrofit2.http.Path


interface api_interface {

    @GET("movie/top_rated")
     fun getTopRate (@Query ("api")  api : String ) : Observable<model_Respond>

     @GET("movie/{id}")
     fun getId (@Path("id") id : Int, @Query ("api") api : String ) : Observable<model_Respond>

     @POST
     fun postData (data : model) : Observable<List<model>>
}
