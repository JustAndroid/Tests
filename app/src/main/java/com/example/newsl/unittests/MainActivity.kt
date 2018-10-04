package com.example.newsl.unittests

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.newsl.utils.Utils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("AAA", Utils.add(2f, 4f).toString()) // Sum of two digits.
        Log.d("AAA", Utils.pow(2f, 3).toString()) // First argument raised to the power of the second argument.
        Log.d("AAA", Utils.pow(0f, -10).toString()) // First argument raised to the power of the second argument.
    }
}
