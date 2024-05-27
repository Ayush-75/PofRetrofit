package com.example.pofRetrofit.di

import android.util.Log
import timber.log.Timber
import javax.inject.Inject

class Computer @Inject constructor(val ram:Ram, val hardDisk: HardDisk) {

    fun getComputer() {
        ram.getRam()
        hardDisk.getHardDisk()
        Timber.tag("TAG").d("getComputer: ")
    }
}

class Ram @Inject constructor() {

    fun getRam() {
        Timber.tag("TAG").d("getRam: ")
    }
}

class HardDisk @Inject constructor() {

    fun getHardDisk() {
        Timber.tag("TAG").d("getHardDisk: ")
    }
}