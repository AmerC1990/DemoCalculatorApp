package com.amercosovic.calculatordummyproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.FragmentManager

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val inflater = inflater.inflate(R.layout.fragment_one, container, false)
        val fragmentTwo = FragmentTwo()
        val addNumbers = inflater.findViewById<Button>(R.id.addNumbersFragmentOne)
        addNumbers.setOnClickListener {
            val firstNumber = inflater.findViewById<EditText>(R.id.enterFirstNumberFragmentOne)
            val secondNumber = inflater.findViewById<EditText>(R.id.enterSecondNumberFragmentOne)
            val sumTextView = inflater.findViewById<TextView>(R.id.displaySumFragmentOne)
            if (firstNumber.text.toString().toInt() > 0 && secondNumber.text.toString().toInt() > 0) {
                val sum = firstNumber.text.toString().toInt() + secondNumber.text.toString().toInt()
                sumTextView.text = sum.toString()
            }

        }
        val goToFragmentTwo = inflater.findViewById<Button>(R.id.goToFragmentTwoButton)
        goToFragmentTwo.setOnClickListener {
            makeCurrentFragment(fragmentTwo)
        }
        return inflater
    }

    private fun makeCurrentFragment(fragment: Fragment) {
        fragmentManager?.beginTransaction()?.apply {
            replace(R.id.fragmentContainer, fragment)
            commit()
        }
    }





}