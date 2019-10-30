package com.example.week5day3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.week5day3.databinding.FragmentOneBinding
import com.example.week5day3.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {
    private val viewModel: MainViewModel by lazy {
        ViewModelProvider(requireActivity(), ViewModelProvider.NewInstanceFactory()).get(
            MainViewModel::class.java
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentTwoBinding>(
            inflater,
            R.layout.fragment_two,
            container,
            false
        )

        binding.viewModel = viewModel
        binding.setLifecycleOwner(this)

        return binding.root
    }
}