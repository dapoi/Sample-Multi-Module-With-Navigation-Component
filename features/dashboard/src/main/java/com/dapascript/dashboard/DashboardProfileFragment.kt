package com.dapascript.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.dapascript.dashboard.databinding.FragmentDashboardProfileBinding

class DashboardProfileFragment : Fragment() {

    private lateinit var binding: FragmentDashboardProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentDashboardProfileBinding.inflate(inflater, container, false)
        return binding.root
    }
}