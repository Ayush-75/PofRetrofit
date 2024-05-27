package com.example.pofRetrofit.di.interfaces

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import timber.log.Timber
import javax.inject.Inject
import javax.inject.Singleton

interface DemoOne{
    fun demoOne()
}

class DemoImpOne @Inject constructor():DemoOne{
    override fun demoOne() {
        Timber.tag("Demo").d("demoOne is calling")
    }
}

class MainOne @Inject constructor(private val demoOne: DemoOne){
    fun demoOne(){
        demoOne.demoOne()
    }
}

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModule2{

    @Binds
    @Singleton
    abstract fun provideOne(demoImplOne: DemoImpOne):DemoOne
}