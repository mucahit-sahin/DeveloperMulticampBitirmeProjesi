package com.mucahitsahin.developermulticampbitirmeprojesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.lifecycleScope
import com.mucahitsahin.developermulticampbitirmeprojesi.adapter.CommunitiesAdapter
import com.mucahitsahin.developermulticampbitirmeprojesi.data.model.CommunityResponse
import com.mucahitsahin.developermulticampbitirmeprojesi.data.model.RetrofitProvider
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launchWhenCreated {
            val response:CommunityResponse=RetrofitProvider.newsApi.getCommunities()
            val adapter=CommunitiesAdapter(response.ClubList.orEmpty().toMutableList())
            recyclerView.adapter=adapter
        }


    }
}