package com.example.parcelable

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstBtn.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            val request = MessageInfo(firstEdit.text.toString(), LocalDateTime.now())
            intent.putExtra("message",request)
            startActivity(intent)
        }


    }
}
