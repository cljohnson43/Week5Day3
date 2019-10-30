package com.example.week5day3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _text: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
    val text: LiveData<String> = _text

    fun setText(str: String) {
        _text.value = str
    }
}