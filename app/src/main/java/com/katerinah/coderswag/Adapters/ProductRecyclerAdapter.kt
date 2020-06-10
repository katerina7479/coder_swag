package com.katerinah.coderswag.Adapters

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.katerinah.coderswag.Models.Product

class ProductRecyclerAdapter(private val context: Context, private  val products: List<Product>) : RecyclerView.Adapter<ProductRecyclerAdapter.Holder>(){

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        TODO("Not yet implemented")
    }
}