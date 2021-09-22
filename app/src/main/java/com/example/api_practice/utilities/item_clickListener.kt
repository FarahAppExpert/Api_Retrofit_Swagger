package com.example.api_practice.utilities

import android.view.View

interface item_clickListener {

    /**
     * Create item click listener to make sure it work for every items comes from the api
     * it makes the item clicable and work
     * @param view
     * @param position
     * @param isLongClick
     */

    fun onClick (view : View, position: Int, isLongClick : Boolean)

}