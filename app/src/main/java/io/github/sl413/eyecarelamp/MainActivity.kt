package io.github.sl413.eyecarelamp

import android.os.Bundle
import android.os.StrictMode
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import miio.philips.EyecareLamp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val eyecareLamp = EyecareLamp(null, null, 1000, 30)
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy) //todo: dirty fix, resolve problem in library
        power_button.setOnClickListener {
            eyecareLamp.togglePower()
        }
    }
}