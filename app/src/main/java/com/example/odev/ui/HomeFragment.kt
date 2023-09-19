package com.example.odev.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.example.odev.R
import com.example.odev.common.viewBinding
import com.example.odev.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBasla.setOnClickListener {
            val isim = binding.etName.text.toString()
            val action = HomeFragmentDirections.homeToInfo(isim)
            findNavController().navigate(action)

        }

    }

}