package com.example.first_android_app

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)

        textView.setText("Hello")

        setContentView(textView)
    }
}