package com.example.cs394_project1.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.cs394_project1.R
import com.example.cs394_project1.databinding.ActivityMainBinding
import com.example.cs394_project1.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private lateinit var binding: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?



    ): View? {
        binding = FragmentProfileBinding.inflate(inflater, container, false)
        binding.progressLayout.visibility = View.GONE
        return binding.root
    }


}