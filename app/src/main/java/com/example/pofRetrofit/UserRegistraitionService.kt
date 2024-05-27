package com.example.pofRetrofit

class UserRegistrationService(private val userRepository: UserRepository,
                              private val emailService: EmailService
) {

    fun registerUser(email: String, password: String){
        userRepository.saveUser(email, password)
        emailService.send(email, "Ayush@123", "User Registered Successfully")
    }
}
