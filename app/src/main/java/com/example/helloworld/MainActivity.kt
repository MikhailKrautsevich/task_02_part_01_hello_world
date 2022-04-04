package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    companion object{
        private val LOG_TAG : String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(LOG_TAG, "Hello World (debug)")
        Log.e(LOG_TAG, "Hello World (error)")
//        Log.w(LOG_TAG, "Hello World (warn)")
//        Log.i(LOG_TAG, "Hello World (info)")
    }
}