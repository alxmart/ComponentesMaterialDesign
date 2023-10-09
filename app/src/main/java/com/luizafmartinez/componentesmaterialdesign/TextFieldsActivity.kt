package com.luizafmartinez.componentesmaterialdesign

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.luizafmartinez.componentesmaterialdesign.databinding.ActivityButtonsBinding

class TextFieldsActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityButtonsBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    companion object {
        fun createIntent(context: Context): Intent = Intent(
            context,
            ButtonsActivity::class.java
        )
    }

}
