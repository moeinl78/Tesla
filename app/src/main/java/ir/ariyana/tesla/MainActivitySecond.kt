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
        val lighters = arrayListOf(
            binding.secondMainActivityLighterFirst,
            binding.secondMainActivityLighterSecond,
            binding.secondMainActivityLighterThird,
            binding.secondMainActivityLighterForth,
        )

        lighters.map { item ->
            item.setOnClickListener {
                item.visibility = View.VISIBLE
            }
        }
    }
}