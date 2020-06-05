package com.katerinah.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.katerinah.coderswag.Models.Category
import com.katerinah.coderswag.R

class CategoryAdapter<T>(val context: Context, val categories: List<Category>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View = LayoutInflater.from(context).inflate(
            R.layout.category_list_item,
            null
        )
        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName: TextView = categoryView.findViewById(R.id.categoryName)
        val selectedCategory = categories[position]
        val imgResourceId = context.resources.getIdentifier(selectedCategory.image, "drawable", context.packageName)

        categoryName.text = selectedCategory.title
        categoryImage.setImageResource(imgResourceId)
        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

}