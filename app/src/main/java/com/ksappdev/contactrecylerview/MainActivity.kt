package com.ksappdev.contactrecylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.contact_list.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrData= arrayListOf<ContactModel>(
            ContactModel(R.drawable.men, "Kumar", "9398912120"),
            ContactModel(R.drawable.men, "Kumar", "9398912120"),
            ContactModel(R.drawable.men, "Kumar", "9398912120"),
            ContactModel(R.drawable.men, "Kumar", "9398912120"),
            ContactModel(R.drawable.men, "Kumar", "9398912120"),
            ContactModel(R.drawable.men, "Kumar", "9398912120"),
            ContactModel(R.drawable.men, "Kumar", "9398912120"),
            ContactModel(R.drawable.men, "Kumar", "9398912120"),
            ContactModel(R.drawable.wom2, "sai", "7989565352"),
            ContactModel(R.drawable.wom2, "sai", "7989565352"),
            ContactModel(R.drawable.wom2, "sai", "7989565352"),
            ContactModel(R.drawable.wom2, "sai", "7989565352"),
            ContactModel(R.drawable.wom2, "sai", "7989565352"),
            ContactModel(R.drawable.wom2, "sai", "7989565352"),
        )
        rcView.layoutManager=LinearLayoutManager(this)
        rcView.adapter=RecyclerAdapter(this,arrData)
    }
}