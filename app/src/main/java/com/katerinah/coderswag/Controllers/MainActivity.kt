package com.katerinah.coderswag.Controllers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import com.katerinah.coderswag.Adapters.CategoryAdapter
import com.katerinah.coderswag.Models.Category
import com.katerinah.coderswag.R
import com.katerinah.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

        categoryListView.setOnItemClickListener {parent: AdapterView<*>?, view: View?, i: Int, l ->
            val category = DataService.categories[i]
            Toast.makeText(this, "You clikced on the ${category.title} cell", Toast.LENGTH_LONG).show()
        }
    }
}