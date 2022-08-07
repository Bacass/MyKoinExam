package com.koin.exam.ui.main

class Cat(private val animal: Animal) {
    fun speek() {
        animal.speek("Cat")
    }
}