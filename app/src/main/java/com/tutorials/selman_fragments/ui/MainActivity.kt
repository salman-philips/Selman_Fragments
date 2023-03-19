package com.tutorials.selman_fragments.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.tutorials.selman_fragments.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addFragment()
    }

    private fun addFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val sampleFragment = SampleFragment()
        fragmentTransaction.add(R.id.fragment_container, sampleFragment).commit()
    }
}