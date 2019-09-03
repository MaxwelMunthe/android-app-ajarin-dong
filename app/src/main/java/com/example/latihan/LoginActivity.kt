package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

    }

    fun btn_signupForm(view: View) {
        startActivity(Intent(this, SignUp_Form::class.java))
    }

    fun btn_login(view: View) {
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }


}
