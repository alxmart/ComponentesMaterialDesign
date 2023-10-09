package com.luizafmartinez.componentesmaterialdesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.luizafmartinez.componentesmaterialdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        insertListeners()




    }

    private fun insertListeners() {

        binding.cvButtons.setOnClickListener {
            startActivity(ButtonsActivity.createIntent(context))

        }






    }
}