package com.example.odev.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.odev.R
import com.example.odev.common.viewBinding
import com.example.odev.databinding.FragmentInfoBinding
import com.example.odev.datamodel.infoModel


class InfoFragment : Fragment(R.layout.fragment_info) {

    private val binding by viewBinding(FragmentInfoBinding::bind)
    private val args by navArgs<InfoFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){
            tvName.text = args.name.toString()

            btnGoCustom.setOnClickListener {
                val email = etEmail.text.toString()
                val phone = etPhone.text.toString()

                val info = infoModel(args.name, email, phone.toInt())
                val action = InfoFragmentDirections.infoToCustom(info)
                findNavController().navigate(action)

            }
        }

    }
}