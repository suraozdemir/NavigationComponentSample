package com.example.odev.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs

import com.example.odev.R
import com.example.odev.common.viewBinding
import com.example.odev.databinding.FragmentCustomBinding
import com.example.odev.datamodel.customModel

class CustomFragment : Fragment(R.layout.fragment_custom) {

    private val binding by viewBinding(FragmentCustomBinding::bind)
    private val args by navArgs<CustomFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){
            tvNameC.text = args.info.name.toString()

            btnGoResult.setOnClickListener {

                val sehir = etSehir.text.toString()
                val okul = etOkul.text.toString()
                val bolum = etBolum.text.toString()

                val custom = customModel(args.info, sehir, okul, bolum)
                val action = CustomFragmentDirections.customToResult(custom)
                findNavController().navigate(action)
            }
        }
    }

}