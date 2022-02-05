package com.bouncy.simpleslideanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bouncy.simpleslideanimation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

binding.root.setOnClickListener{
    binding.txt.slideUp(1000L,0L)
}

    }
}