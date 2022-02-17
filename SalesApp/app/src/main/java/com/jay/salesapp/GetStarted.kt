package com.jay.salesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_get_started.*
import kotlinx.android.synthetic.main.images.*
import kotlinx.android.synthetic.main.items.*

class GetStarted : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_started)

        supportActionBar?.hide()
        val adapter = StartedAdapter()
        val dl = arrayListOf<lists>()
//        dl.add(lists("contact",info))
        dl.add(lists("connecct",R.drawable.connect))
        dl.add(lists("From across the globe",R.drawable.worldm))
        dl.add(lists("Proven history",R.drawable.statcol))
        dl.add(lists("World Reknown",R.drawable.worldm))

        adapter.list = dl

        recycle.adapter = adapter
        LinearLayoutManager.HORIZONTAL
        recycle.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,true)


    }
}