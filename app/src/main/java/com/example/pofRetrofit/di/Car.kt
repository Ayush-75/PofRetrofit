package com.example.pofRetrofit.di

import timber.log.Timber
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, private val wheel: Wheel) {

    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Timber.tag("Main").d("Car is running")
    }
}
class Engine @Inject constructor() {

    fun getEngine(){
        Timber.tag("Main").d("Engine Started")
    }
}
class Wheel @Inject constructor(){

    fun getWheel(){
        Timber.tag("Main").d("Wheel Started")
    }
}