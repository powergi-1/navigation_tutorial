package com.example.navigation_tutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.navigation_tutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var mBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        var navigationFragment = supportFragmentManager.findFragmentById(R.id.main_nav_host) as NavHostFragment

        val navController = navigationFragment.navController

        NavigationUI.setupWithNavController(mBinding.mainBottomNav, navController)
    }
}