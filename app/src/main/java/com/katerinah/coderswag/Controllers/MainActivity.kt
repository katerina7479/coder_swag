package com.katerinah.coderswag.Controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.katerinah.coderswag.Adapters.CategoryRecyclerAdapter
import com.katerinah.coderswag.R
import com.katerinah.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecyclerAdapter(this, DataService.categories)
        categoryRecylerView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoryRecylerView.layoutManager = layoutManager
        categoryRecylerView.setHasFixedSize(true)
    }
}