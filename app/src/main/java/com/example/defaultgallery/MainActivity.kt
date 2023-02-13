package com.example.defaultgallery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.defaultgallery.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        binding.apply {
            btnCamera.setOnClickListener {

            }

            btnGallery.setOnClickListener {
                val intent=Intent(this@MainActivity,GalleryActivity::class.java)
                startActivity(intent)
            }
        }

    }
}