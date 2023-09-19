package com.example.odev.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.odev.R
import com.example.odev.common.viewBinding
import com.example.odev.databinding.FragmentResultBinding


class ResultFragment : Fragment(R.layout.fragment_result) {

    private val binding by viewBinding(FragmentResultBinding::bind)
    private val args by navArgs<ResultFragmentArgs>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding){

            tvNameR.text = args.custom.infoModel.name.toString()
            tvEmail.text = args.custom.infoModel.email.toString()
            tvPhone.text = args.custom.infoModel.phone.toString()
            tvSehir.text = args.custom.sehir.toString()
            tvOkul.text = args.custom.okul.toString()
            tvBolum.text = args.custom.bolum.toString()

            btnGoHome.setOnClickListener {

                findNavController().popBackStack(R.id.homeFragment, false)
            }
    }

    }
}