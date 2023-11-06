package com.example.kotlinrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity(),RecyclerviewAdapter.ItemClickListners{


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerview)
        // var linearLayoutManager = LinearLayoutManager(this)

        recyclerView.layoutManager = LinearLayoutManager(this)


        val arrdetails = ArrayList<DataItems>()

        arrdetails.add(DataItems(R.drawable.ic_launcher_foreground, "Utkarsh"))
        arrdetails.add(DataItems(R.drawable.ic_launcher_background, "TWARA"))
        arrdetails.add(DataItems(R.drawable.ic_launcher_foreground, "SANJAY"))
        arrdetails.add(DataItems(R.drawable.ic_launcher_background, "VARSHA"))
        arrdetails.add(DataItems(R.drawable.ic_launcher_foreground, "AVINASH"))
        arrdetails.add(DataItems(R.drawable.ic_launcher_background, "SHITAL"))
        arrdetails.add(DataItems(R.drawable.ic_launcher_foreground, "VIVEK"))
        arrdetails.add(DataItems(R.drawable.ic_launcher_foreground, "hIMANI"))
        arrdetails.add(DataItems(R.drawable.ic_launcher_foreground, "ASHISH"))
        arrdetails.add(DataItems(R.drawable.ic_launcher_foreground, "HADA"))


        val recyclerviewAdapter = RecyclerviewAdapter(this, arrdetails, this)
        recyclerView.adapter = recyclerviewAdapter

    }

    override fun onItemClick(position: Int) {
        var inext = Intent(this,DetailedActivity::class.java)
        startActivity(inext)
    }



}

