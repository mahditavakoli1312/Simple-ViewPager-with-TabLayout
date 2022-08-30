package com.example.sample_viewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.sample_viewpager.adapter.PageAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.vp_viewpager_activitymain)
        viewPager.adapter = PageAdapter(supportFragmentManager)

        val tabLayout = findViewById<TabLayout>(R.id.tl_tablayout_activitymain)
        tabLayout.setupWithViewPager(viewPager)

        setupTabIconsForTwo(
            tabLayout = tabLayout,
            firstIcon = R.drawable.ic_myarticles,
            secondIcon = R.drawable.ic_bookmark
        )


    }

    private fun setupTabIconsForTwo(tabLayout: TabLayout, firstIcon: Int, secondIcon: Int) {
        tabLayout.getTabAt(0)?.setIcon(firstIcon)
        tabLayout.getTabAt(1)?.setIcon(secondIcon)
    }
}