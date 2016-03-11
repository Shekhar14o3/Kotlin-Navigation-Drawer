package com.navigationdrawer

import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.view.MenuItem
import android.widget.Toast
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    private var drawerLayout: DrawerLayout? = null
    private var toolbar: Toolbar? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)
        initNavigationDrawer()
    }

    fun initNavigationDrawer() {

        // refer the navigation view of the xml
        val navigationView = findViewById(R.id.navigation_view) as NavigationView
        navigationView.setNavigationItemSelectedListener { menuItem ->
            val id = menuItem.itemId
            when (id) {
                R.id.option_a -> {
                    Toast.makeText(applicationContext, "You Clicked Options A", Toast.LENGTH_SHORT).show()
                    drawerLayout!!.closeDrawers()
                }
                R.id.option_b -> {
                    Toast.makeText(applicationContext, "You Clicked Options B", Toast.LENGTH_SHORT).show()
                    drawerLayout!!.closeDrawers()
                }
                R.id.option_c -> {
                    Toast.makeText(applicationContext, "You Clicked Options C", Toast.LENGTH_SHORT).show()
                    drawerLayout!!.closeDrawers()
                }
                R.id.option_d -> {
                    Toast.makeText(applicationContext, "You Clicked Options C", Toast.LENGTH_SHORT).show()
                    drawerLayout!!.closeDrawers()
                }
            }
            true
        }
        val header = navigationView.getHeaderView(0)
        drawerLayout = findViewById(R.id.drawer) as DrawerLayout
        val actionBarDrawerToggle = object : ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close) {
            override fun onDrawerClosed(v: View?) {
                super.onDrawerClosed(v)
            }

            override fun onDrawerOpened(v: View?) {
                super.onDrawerOpened(v)
            }
        }
        drawerLayout!!.addDrawerListener(actionBarDrawerToggle)
        actionBarDrawerToggle.syncState()
    }
}