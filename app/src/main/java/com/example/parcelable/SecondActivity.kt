package com.example.parcelable

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val message = intent.getParcelableExtra<MessageInfo>("message")
        secondView1.text=message.content
        secondView2.text=message.send_time.toString()

    }
}
