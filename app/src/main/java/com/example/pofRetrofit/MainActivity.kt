package com.example.pofRetrofit

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.pofRetrofit.di.Car
import com.example.pofRetrofit.di.Computer
import com.example.pofRetrofit.di.Downloader
import com.example.pofRetrofit.di.DownloaderFactory
import com.example.pofRetrofit.di.interfaces.ImplOne
import com.example.pofRetrofit.di.interfaces.Main
import com.example.pofRetrofit.di.interfaces.MainOne
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var  car: Car
    @Inject
    lateinit var computer: Computer

    @Inject
    lateinit var main:MainOne

    private val downloader = DownloaderFactory.create()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.plant(Timber.DebugTree())

        car.getCar()

        computer.getComputer()

        downloader.getDownload()

        main.demoOne()

//        Main(ImplOne()).main()

//        BaseApp().main.main()



//        val userRepository = UserRepository()
//        val emailService = EmailService()
//
//        val userRegistrationService = UserRegistrationService(userRepository,emailService)
//        userRegistrationService.registerUser("James@gmail.com", "123456")

    }
}