package com.example.prueba.DashBoard

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba.Movement
import kotlinx.android.synthetic.main.item_resumen_movimiento.view.*

class DashBoardDeudorViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    fun bind(item: Movement, dashBoardInterface: DashBoardInterface) = with(itemView) {
        textViewDeudorRecycler.text = item.debtor
        textViewDeudaRecycler.text = item.debt.toString()

        cardviewDashBoardMovement.setOnClickListener {
            dashBoardInterface.launchDebListFragment(item)
        }
    }

}