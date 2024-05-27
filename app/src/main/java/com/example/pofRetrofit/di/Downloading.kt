package com.example.pofRetrofit.di

import timber.log.Timber


class HttpClient{}
class Executor{}
class Request constructor(private val client:HttpClient,private val executor:Executor){
    fun getRequest(){
        Timber.tag("Main").d("File downloading")
    }
}
class Downloader constructor(private val request: Request){
    fun getDownload(){
        request.getRequest()
    }
}

object DownloaderFactory{
    fun create():Downloader{
        val client=HttpClient()
        val executor = Executor()
        val request = Request(client,executor)
        return Downloader(request)

    }
}