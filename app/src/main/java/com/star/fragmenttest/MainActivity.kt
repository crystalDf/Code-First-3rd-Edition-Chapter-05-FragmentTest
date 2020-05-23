package com.star.fragmenttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_left.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        button.setOnClickListener { replaceFragment(AnotherRightFragment()) }
//
//        replaceFragment(RightFragment())
    }

//    private fun replaceFragment(fragment: Fragment) {
//
//        val fragmentManager = supportFragmentManager
//        val fragmentTransaction = fragmentManager.beginTransaction()
//        fragmentTransaction.replace(R.id.rightLayout, fragment)
//        fragmentTransaction.addToBackStack(null)
//        fragmentTransaction.commit()
//    }
}
