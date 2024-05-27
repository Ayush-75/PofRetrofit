package com.example.pofRetrofit

import android.util.Log
import timber.log.Timber

class UserRepository {
    fun saveUser(email:String,password:String){
        Timber.tag("User Repository").d("User Saved in DB")
    }
}