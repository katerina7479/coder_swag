package com.katerinah.coderswag.Controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.katerinah.coderswag.R
import com.katerinah.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

//    lateinit var adapter: ProductRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val category = intent.getStringExtra(EXTRA_CATEGORY)
        println(category)
    }
}