package com.example.kotlinrecyclerview.Repository

import com.example.kotlinrecyclerview.DataItems
import com.example.kotlinrecyclerview.R

class DataRepository {

    companion object{
        fun setData() : ArrayList<DataItems>{



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

            return arrdetails
        }
    }
}