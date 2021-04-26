package com.badzohugues.splitztemplateapp.ui.home

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.badzohugues.splitztemplateapp.R
import com.badzohugues.splitztemplateapp.common.BaseActivity
import com.badzohugues.splitztemplateapp.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding>() {
    private lateinit var navController: NavController

    override fun getViewBinding() = ActivityHomeBinding.inflate(layoutInflater)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        navController = (supportFragmentManager.findFragmentById(binding.homeNavHost.id) as NavHostFragment).navController
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.userReposFragment, R.id.searchFragment))
        setupActionBar(navController, appBarConfiguration)
        setupBottomNavMenu(navController)
    }

    override fun onSupportNavigateUp() = navController.navigateUp() || super.onSupportNavigateUp()

    private fun setupActionBar(navController: NavController, appBarConfiguration: AppBarConfiguration) {
        supportActionBar?.hide()
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    private fun setupBottomNavMenu(navController: NavController) {
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}