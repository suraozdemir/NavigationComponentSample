package com.example.odev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.odev.common.viewBinding
import com.example.odev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by viewBinding(ActivityMainBinding::inflate)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}