package com.example.api_practice.api_swagger

import com.example.api_practice.adapter.adapter
import com.squareup.moshi.Moshi

class api_class_swagger {
    val moshi = Moshi.Builder()
        .add(MoshiKotlin :: class.java)
        .build()

    val moshiAdapter = moshi.adapter (adapter :: class.java)

    val issue = moshiAdapter.fromJson(json)
}
