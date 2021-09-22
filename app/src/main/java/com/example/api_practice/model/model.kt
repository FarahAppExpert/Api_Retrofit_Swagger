package com.example.api_practice.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class model (

    @SerializedName("id")
    @Expose
    var id : Int,

    @SerializedName("original_language")
    @Expose
    var original_language : String,

    @SerializedName("original_title")
    @Expose
    var original_title : String,

    @SerializedName ("overview")
    @Expose
    var overview : String
        )
{

    public fun setid (id : Int)
    {
        this.id = id
    }

    public fun getid () : Int
    {
        return id
    }

    public fun setoriginal_language (original_language : String)
    {
        this.original_language = original_language
    }

    public fun getoriginal_language () : String
    {
        return original_language
    }


    public fun setoriginal_title (original_title : String)
    {
       this.original_title = original_title
    }
    public fun getoriginal_title () : String
    {
        return original_title
    }

    public fun setoverview (overview : String)
    {
        this.overview = overview

    }

    public fun getoverview () : String
    {
        return overview
    }


}