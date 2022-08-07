package com.koin.exam.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun doSomething() {
        Log.d("MainViewModel", "doSomething")
    }
}