package com.example.fragmentsversion1

import android.icu.number.IntegerWidth
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.fragmentsversion1.databinding.AdditionFragmentViewBinding

class AdditionFragment : Fragment() {
private lateinit var binding: AdditionFragmentViewBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = AdditionFragmentViewBinding.inflate(inflater)
        binding.btnAddition.setOnClickListener {
            var num1 = Integer.parseInt(binding.edtNumberOne.text.toString())
            var num2 = Integer.parseInt(binding.edtNumberTwo.text.toString())
            binding.txtAddition.text = "${num1 + num2}"

        }
        return binding.root
    }

    /*
    private lateinit var edtNumberOne: EditText
    private lateinit var edtNumberTwo: EditText
    private lateinit var txtAddition: TextView
    private lateinit var btnAddition: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var additionFragmentView = inflater.inflate(R.layout.addition_fragment_view, null)

        initViews(additionFragmentView)
        initListeners()

        return additionFragmentView
    }

    private fun initViews(view: View) {
        edtNumberOne = view.findViewById(R.id.edtNumberOne)
        edtNumberTwo = view.findViewById(R.id.edtNumberTwo)
        txtAddition = view.findViewById(R.id.txtAddition)
        btnAddition = view.findViewById(R.id.btnAddition)
    }

    private fun initListeners() {
        btnAddition.setOnClickListener(BtnAdditionCLick())
    }

    private inner class BtnAdditionCLick : View.OnClickListener {
        override fun onClick(v: View?) {
            var one =  Integer.parseInt(edtNumberOne.text.toString())
            var two = Integer.parseInt(edtNumberTwo.text.toString())
            //var two = edtNumberTwo.text.toString().toInt()
            txtAddition.text = " ${one + two}"
        }
    }

     */
}

