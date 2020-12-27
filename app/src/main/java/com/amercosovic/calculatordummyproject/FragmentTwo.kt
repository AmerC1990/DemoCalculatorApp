package com.amercosovic.calculatordummyproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class FragmentTwo : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val inflater = inflater.inflate(R.layout.fragment_two, container, false)
        val addNumbers = inflater.findViewById<Button>(R.id.addNumbersFragmentTwo)
        addNumbers.setOnClickListener {
            val firstNumber = inflater.findViewById<EditText>(R.id.enterFirstNumberFragmentTwo)
            val secondNumber = inflater.findViewById<EditText>(R.id.enterSecondNumberFragmentTwo)
            val sumTextView = inflater.findViewById<TextView>(R.id.displaySumFragmentTwo)
            if (firstNumber.text.toString().contains(".") && secondNumber.text.toString().contains(".")) {
                val sum = firstNumber.text.toString().toDouble() + secondNumber.text.toString().toDouble()
                sumTextView.text = sum.toString()
            }
            else if (firstNumber.text.toString().contains(".") && !secondNumber.text.toString().contains(".")) {
                val sum = firstNumber.text.toString().toDouble() + secondNumber.text.toString().toInt()
                sumTextView.text = sum.toString()
            }
            else if (!firstNumber.text.toString().contains(".") && secondNumber.text.toString().contains(".")) {
                val sum = firstNumber.text.toString().toInt() + secondNumber.text.toString().toDouble()
                sumTextView.text = sum.toString()
            }
            else {
                val sum = firstNumber.text.toString().toInt() + secondNumber.text.toString().toInt()
                sumTextView.text = sum.toString()
            }
        }

        return inflater
    }


}