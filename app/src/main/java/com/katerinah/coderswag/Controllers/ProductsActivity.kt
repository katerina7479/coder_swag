package com.katerinah.coderswag.Controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.katerinah.coderswag.Adapters.ProductRecyclerAdapter
import com.katerinah.coderswag.R
import com.katerinah.coderswag.Services.DataService
import com.katerinah.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val category: String? = intent.getStringExtra(EXTRA_CATEGORY)
        productCategory.text = category

        adapter = ProductRecyclerAdapter(this, DataService.getProducts(category))
        productRecyclerView.adapter = adapter

        val layoutManager = GridLayoutManager(this, 2)
        productRecyclerView.layoutManager = layoutManager
        //productRecyclerView.setHasFixedSize(true)
    }
}