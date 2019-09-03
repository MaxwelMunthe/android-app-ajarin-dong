package com.example.latihan

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_direction.*
import kotlinx.android.synthetic.main.activity_direction1.*

class DirectionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_direction1)

        val typeface = Typeface.createFromAsset(assets, "Chelsea.ttf")
        title1.typeface = typeface
    }
}
