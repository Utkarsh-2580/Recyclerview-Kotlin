package com.example.kotlinrecyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class RecyclerviewAdapter(var context : Context, var datalist : ArrayList<DataItems>,val itemClickListners: ItemClickListners) : RecyclerView.Adapter<RecyclerviewAdapter.storeddata>() {


    class storeddata(view : View,itemClickListners: ItemClickListners) : ViewHolder(view) {
        var imageview_RV = view.findViewById<ImageView>(R.id.imageview_RV)
        var textview_RV = view.findViewById<TextView>(R.id.textview_RV)

        init {
            view.setOnClickListener{
                itemClickListners.onItemClick(adapterPosition)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): storeddata {

        var view = LayoutInflater.from(context).inflate(R.layout.item_list,parent,false)
        return storeddata(view,itemClickListners)
    }

    override fun getItemCount(): Int {
        return datalist.size
    }

    override fun onBindViewHolder(holder: storeddata, position: Int) {

        holder.textview_RV.text = datalist[position].name
        holder.imageview_RV.setImageResource(datalist[position].Image)
    }


    interface ItemClickListners{
        fun onItemClick(position : Int)
    }

    fun setData(datalist: ArrayList<DataItems>){
        this.datalist = datalist
    }
}


