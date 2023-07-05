package com.example.myshop.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myshop.models.Products
import com.example.myshop.databinding.ProductListItemsBinding

class ProductRvAdapter(var products: List<Products>):RecyclerView.Adapter<ProductRvAdapter.ProductsViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ProductsViewHolder {
        val binding=ProductListItemsBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProductsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        val currentProduct=products.get(position)
        val binding=holder.binding
        binding.tvbrand.text=currentProduct.brand
        binding.tvcategory.text=currentProduct.category
        binding.tvId.text=currentProduct.id.toString()
        binding.tvprice.text=currentProduct.price.toString()
        binding.tvdescription.text=currentProduct.description
        binding.tvratings.text=currentProduct.rating.toString()
        binding.tvstock.text=currentProduct.stock.toString()
        binding.tvthumbnails.text=currentProduct.thumbnails
        binding.tvTitle.text=currentProduct.title

    }

    override fun getItemCount(): Int {
        return products.size
    }

    class ProductsViewHolder(var binding: ProductListItemsBinding):RecyclerView.ViewHolder(binding.root)
}