package com.example.myshop.repository

import com.example.myshop.api.ApiClient
import com.example.myshop.api.ApiInterface
import com.example.myshop.models.ProductResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class ProductsRepository {
    val apiClient =
        ApiClient.buildApiClient(ApiInterface::class.java)
    suspend fun getProducts(): Response<ProductResponse>{
        return  withContext(Dispatchers.IO){
            apiClient.getProducts()
        }

    }
}