package ir.ariyana.tesla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import ir.ariyana.tesla.databinding.ActivityMainSecondBinding

class MainActivitySecond : AppCompatActivity() {

    lateinit var binding : ActivityMainSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainSecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.secondCard1.setOnClickListener {
            var state = false
            binding.secondMainActivityLighterFirst.isVisible = !state
            state = !state
        }

        binding.secondCard2.setOnClickListener {
            var state = false
            binding.secondMainActivityLighterSecond.isVisible = !state
            state = !state
        }

        binding.secondCard3.setOnClickListener {
            var state = false
            binding.secondMainActivityLighterThird.isVisible = !state
            state = !state
        }

        binding.secondCard4.setOnClickListener {
            var state = false
            binding.secondMainActivityLighterForth.isVisible = !state
            state = !state
        }
    }
}