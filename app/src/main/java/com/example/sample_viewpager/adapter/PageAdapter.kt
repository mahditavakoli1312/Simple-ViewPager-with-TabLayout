package com.example.sample_viewpager.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.sample_viewpager.fragments.FirstFragment
import com.example.sample_viewpager.fragments.SecondFragment

class PageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> {
                return FirstFragment()
            }
            1 -> {
                return SecondFragment()
            }
            else -> {
                return FirstFragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when (position) {
            0 -> {
                return "مقالات من"
            }
            1 -> {
                return "بوکمارک ها"
            }
        }
        return super.getPageTitle(position)
    }

}
