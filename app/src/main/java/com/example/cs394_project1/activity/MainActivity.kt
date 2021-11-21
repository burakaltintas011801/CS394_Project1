package com.example.cs394_project1.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cs394_project1.R
import com.example.cs394_project1.adapter.PersonAdapter
import com.example.cs394_project1.data.Datasource
import com.example.cs394_project1.databinding.ActivityMainBinding
import com.example.cs394_project1.fragment.CrushListFragment
import com.example.cs394_project1.fragment.MatchFragment
import com.example.cs394_project1.fragment.ProfileFragment
import com.example.cs394_project1.model.Person
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var profileFragment: ProfileFragment? = null
    private var crushListFragment: CrushListFragment? = null
    private var matchFragment: MatchFragment? = null

    private var profileTab: TabLayout.Tab? = null
    private var crushListTab: TabLayout.Tab? = null
    private var matchTab: TabLayout.Tab? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        profileTab = binding.navigationTabs.newTab()
        crushListTab = binding.navigationTabs.newTab()
        matchTab = binding.navigationTabs.newTab()

        profileTab?.icon = ContextCompat.getDrawable(this, R.drawable.tab_profile)
        crushListTab?.icon = ContextCompat.getDrawable(this, R.drawable.tab_crush_list)
        matchTab?.icon = ContextCompat.getDrawable(this, R.drawable.tab_match)

        binding.navigationTabs.addTab(profileTab!!)
        binding.navigationTabs.addTab(crushListTab!!)
        binding.navigationTabs.addTab(matchTab!!)
        binding.navigationTabs.addOnTabSelectedListener(object :
            TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (tab) {
                    profileTab -> {
                        if (profileFragment == null) {
                            profileFragment = ProfileFragment()
                        }
                        replaceFragment(profileFragment!!)
                    }
                    crushListTab -> {
                        if (crushListFragment == null) {
                            crushListFragment = CrushListFragment()

                        }
                        replaceFragment(crushListFragment!!)
                    }
                    matchTab -> {
                        if (matchFragment == null) {
                            matchFragment = MatchFragment()

                        }
                        replaceFragment(matchFragment!!)
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                onTabSelected(tab)
            }

        })
        profileTab?.select()




    }

    fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragmentContainer, fragment)
        transaction.commit()
    }


}