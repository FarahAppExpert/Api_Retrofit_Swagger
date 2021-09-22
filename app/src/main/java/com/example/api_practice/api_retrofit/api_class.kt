package com.example.api_practice.api_retrofit

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class api_class {

    companion object {

        private var retrofit: Retrofit? = null
        public  var url: String = "https://api.themoviedb.org/3/"
        public val apiKey: String = "c52a827e70fb473d0ee1f066a815c5b7"


        public fun setApiRetrofit(): Retrofit {
            val httpLoggingInterceptor: HttpLoggingInterceptor = HttpLoggingInterceptor()
            httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
            val okHttpClient: OkHttpClient = OkHttpClient()
            if (retrofit == null) {
                val retrofit = Retrofit.Builder()
                    .baseUrl(url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(okHttpClient)
                    .build()
            }

            return retrofit!!
        }

    }


}