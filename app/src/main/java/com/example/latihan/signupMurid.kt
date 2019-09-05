package com.example.latihan

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_sign_up__form.*
import kotlinx.android.synthetic.main.activity_signup_murid.*

class signupMurid : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_murid)


    }
    fun btn_daftar (view: View) {
        startActivity(Intent(this, MainActivity::class.java))}
}
