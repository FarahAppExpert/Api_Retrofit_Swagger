package com.example.api_practice

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.api_practice.adapter.adapter
import com.example.api_practice.api_retrofit.api_class
import com.example.api_practice.api_retrofit.api_interface
import com.example.api_practice.utilities.RxUtils
import rx.subscriptions.CompositeSubscription


class MainActivity : AppCompatActivity() {

    private lateinit var  recyclerView : RecyclerView
    private lateinit var adapter : adapter
    private lateinit var dailog : ProgressDialog
    private var compositeSubscription : CompositeSubscription = CompositeSubscription()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initialRecyclerView();
        intialaizeProgress();
        displayList();


    }

    public fun displayList()
    {
        val apiService : api_interface = api_class.setApiRetrofit().create(api_interface :: class.java)
        apiService.getTopRate(api_class.apiKey)

        /*
        apiService.getTopRate(api_class.apiKey)
            .onSubscribe(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(Observer<model_Respond>() {

                @Override
                 fun onSubscribe(d : Disposable) {

                }

                @Override
                 fun onNext(modelRespond: model_Respond) {
                    if (recyclerView != null) {
                        var allList : List<model>  = modelRespond.results
                        adapter =  adapter(allList, R.layout.model_list_view, getApplicationContext());
                        recyclerView.setAdapter(adapter);
                        hidePDialog();
                    }
                }





                @Override
                fun onError(exception : Throwable) {
                    hidePDialog();
                    Log.d("Error", exception.getMessage());
                }

                @Override
                 fun onComplete() {

                }
            });


         */

    }


    public override fun onResume() {
        super.onResume();
        compositeSubscription = RxUtils.getNewCompositeSubIfUnsubscribed(compositeSubscription);
    }


    public override fun onPause() {
        super.onPause();
        RxUtils.unsubscribeIfNotNull(compositeSubscription);
    }

    @Override
    public override fun onDestroy() {
        super.onDestroy();
        hidePDialog();
    }

    public fun initialRecyclerView(){
        recyclerView = findViewById(R.id.list_view) as RecyclerView
        recyclerView.setLayoutManager(LinearLayoutManager(this));
        recyclerView.setItemAnimator(DefaultItemAnimator());
    }
    public fun intialaizeProgress(){
        dailog =  ProgressDialog(this);
        dailog.setMessage("Loading...");
        dailog.show();
    }

    private fun hidePDialog() {
        if (dailog != null) {
            dailog.dismiss()
            dailog!!
        }
    }



}