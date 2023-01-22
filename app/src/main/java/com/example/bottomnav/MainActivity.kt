package com.example.bottomnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val BottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNav)
        val NavController = findNavController(R.id.fragment)

        //nampilkan label
        val appBarConfiguration = AppBarConfiguration(setOf(R.id.beranda, R.id.musik, R.id.setting))
        setupActionBarWithNavController(NavController, appBarConfiguration)

        BottomNavigationView.setupWithNavController(NavController)
    }
}