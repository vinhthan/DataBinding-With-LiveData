package com.example.databindingwithlivedata

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    val currentRandomFood: LiveData<String> get() = Food.currentRandomFood

    fun onChangeRandomFood() = Food.changeRandomFood()

    //@Bindable
    val edittextContent = MutableLiveData<String>()

    private val _displayEdittext = MutableLiveData<String>()
    val displayEdittext: LiveData<String> get() = _displayEdittext

    fun onDisplayEdittextContent() {
        _displayEdittext.value = edittextContent.value
    }

    fun onSelectRandom() {
        edittextContent.value = Food.getRandomFood()
    }



}