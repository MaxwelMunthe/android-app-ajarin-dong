package com.example.latihan

import android.content.Intent
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ActionMenuView
import kotlinx.android.synthetic.main.activity_sign_up__form.*

class SignUp_Form : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up__form)

    }

    fun btn_signupPengajar (view: View) {
        startActivity(Intent(this, signuppengajar::class.java))}

    fun btn_signupMurid (view: View) {
        startActivity(Intent(this, signupMurid::class.java))}



}
