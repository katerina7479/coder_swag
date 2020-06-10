package com.katerinah.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.katerinah.coderswag.Models.Product
import com.katerinah.coderswag.R

class ProductRecyclerAdapter(private val context: Context, private  val products: List<Product>) : RecyclerView.Adapter<ProductRecyclerAdapter.Holder>(){

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val productImage: ImageView = itemView.findViewById(R.id.productImage)
        private val productDescription: TextView = itemView.findViewById(R.id.productDescription)
        private val productPrice: TextView = itemView.findViewById(R.id.productPrice)

        fun bindProduct(product: Product, context: Context) {
            val imgResourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)
            productImage.setImageResource(imgResourceId)
            productDescription.text = product.title
            productPrice.text = product.price
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_list_item, parent, false)
        return Holder((view))
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindProduct(products[position], context)
    }
}