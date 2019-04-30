package com.example.prueba.Debtlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba.DashBoard.DashBoardFragment.Companion.dashBoardInterface
import com.example.prueba.Debt
import com.example.prueba.R

class DebtListAdapter(private val debts:ArrayList<Debt>?): RecyclerView.Adapter<DebtListViewHolder>( ) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= DebtListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_desglose_movimiento,parent,false))

    override fun getItemCount(): Int =if (debts.isNullOrEmpty()) 0 else debts.size

    override fun onBindViewHolder(holder: DebtListViewHolder, position: Int) {
        debts.let { holder.bind(debts!![position],dashBoardInterface) }
    }


}
