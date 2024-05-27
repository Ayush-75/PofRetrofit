package com.example.pofRetrofit

import timber.log.Timber

class EmailService {
    fun send(to:String,from:String,body:String?){
        Timber.tag("EmailService").d("Email Sent")
    }
}