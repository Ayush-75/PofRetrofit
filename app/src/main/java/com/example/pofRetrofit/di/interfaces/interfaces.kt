package com.example.pofRetrofit.di.interfaces

import timber.log.Timber

interface One{
    fun one()
}

class ImplOne: One{
    override fun one() {
        Timber.tag("One").d("One is calling")
    }
}
class Main constructor(private val one: One){
    fun main(){
        one.one()
    }
}

object AppModule{
    val main = Main(ImplOne())
}