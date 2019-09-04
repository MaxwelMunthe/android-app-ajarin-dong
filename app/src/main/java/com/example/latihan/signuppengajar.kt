package com.example.latihan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class signuppengajar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signuppengajar)
    }
    fun btn_daftar (view: View) {
        startActivity(Intent(this, MainActivity::class.java))}
}
