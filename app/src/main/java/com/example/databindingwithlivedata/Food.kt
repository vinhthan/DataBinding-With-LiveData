package com.example.databindingwithlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.*

object Food {
    private val listFood: List<String> = listOf(
        "banh my, bo, ca, sua chua, thit ga, thit heo, nam, gao"
    )

    private val _currentRandomFood = MutableLiveData<String>()
    val currentRandomFood: LiveData<String> get() = _currentRandomFood

    init {
        _currentRandomFood.value = listFood.first()
    }

    fun getRandomFood(): String {
        val random = Random()
        return listFood[random.nextInt(listFood.size)]
    }

    fun changeRandomFood() {
        _currentRandomFood.value = getRandomFood()
    }


}