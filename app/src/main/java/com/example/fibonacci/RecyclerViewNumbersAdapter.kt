package com.example.fibonacci

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger

class RecyclerViewNumbers(var numbersList: List<BigInteger>) :RecyclerView.Adapter<NumberViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
       var itemview=LayoutInflater.from(parent.context).
       inflate(R.layout.numbers_recycle,parent,false)
        return NumberViewHolder(itemview)
    }
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.tvNumbers.text=numbersList.get(position).toString()
    }

    override fun getItemCount(): Int {
        return numbersList.size
    }
}
    class NumberViewHolder(var itemview:View):RecyclerView.ViewHolder(itemview) {
        var tvNumbers=itemview.findViewById<TextView>(R.id.tvNumbers)
    }
