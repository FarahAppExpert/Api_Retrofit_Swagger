package com.example.api_practice.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class model_Respond(
  @SerializedName("page")
  @Expose
  val page : Int,

  @SerializedName("total_pages")
  @Expose
  val total_pages : Int,

  @SerializedName ("total_results")
  @Expose
  val total_results : Int,

  @SerializedName ("results")
  @Expose
  val results : List<model>
  ){



}