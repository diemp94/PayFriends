package com.example.prueba.DashBoard

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba.Movement
import com.example.prueba.R

class DashBoardDedudorAdapter(private val moves:ArrayList<Movement>?, private val context : Context, private val dashBoardInterface: DashBoardInterface) : RecyclerView.Adapter<DashBoardDeudorViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = DashBoardDeudorViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_resumen_movimiento, parent, false))

    override fun getItemCount(): Int =if (moves.isNullOrEmpty()) 0 else moves.size

    override fun onBindViewHolder(holder: DashBoardDeudorViewHolder, position: Int) {
        moves.let {
            holder.bind(moves!![position],dashBoardInterface)

        }
    }


}