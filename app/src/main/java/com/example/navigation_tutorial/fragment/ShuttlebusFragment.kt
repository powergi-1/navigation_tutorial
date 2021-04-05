package com.example.navigation_tutorial.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.navigation_tutorial.databinding.FragmentRestaurantBinding
import com.example.navigation_tutorial.databinding.FragmentShuttlebusBinding

class ShuttlebusFragment: Fragment() {
    private var mBinding : FragmentShuttlebusBinding? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var binding = FragmentShuttlebusBinding.inflate(inflater, container, false)
        mBinding = binding

        return mBinding?.root
    }

    override fun onDestroy() {
        mBinding = null
        super.onDestroy()
    }
}