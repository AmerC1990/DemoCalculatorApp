package com.amercosovic.calculatordummyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentOne = FragmentOne()
        val fragmentTwo = FragmentTwo()
        makeCurrentFragment(fragmentOne)

        val changeFragmentButton = findViewById<Button>(R.id.changeFragmentButton)
        changeFragmentButton.setOnClickListener {
            if (fragmentOne.isVisible) {
                makeCurrentFragment(fragmentTwo)
            }
            else {
                makeCurrentFragment(fragmentOne)
            }
        }


    }

    private fun makeCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragment)
            commit()
        }
    }
}