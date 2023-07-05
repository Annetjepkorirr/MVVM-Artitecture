package com.example.myshop.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope

import com.example.myshop.models.Products
import com.example.myshop.repository.ProductsRepository
import kotlinx.coroutines.launch

class ProductsViewModel: ViewModel() {
    val productsRepo = ProductsRepository()
    val productsLiveData = MutableLiveData<List<Products>>()
    val errorLIveData = MutableLiveData<String>()

    fun fetchProducts(){
        viewModelScope.launch{
            val response = productsRepo.getProducts()
            if (response.isSuccessful){
                productsLiveData.postValue(response.body()?.products)
            }
            else{
                errorLIveData.postValue(response.errorBody()?.string())
            }
        }


    }
}