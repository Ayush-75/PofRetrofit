package com.example.pofRetrofit

import android.app.Application
import com.example.pofRetrofit.di.Car
import com.example.pofRetrofit.di.Engine
import com.example.pofRetrofit.di.Wheel
import com.example.pofRetrofit.di.interfaces.AppModule
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class BaseApp:Application() {

//    var car = Car(Engine(), Wheel())

    val main  = AppModule.main
}