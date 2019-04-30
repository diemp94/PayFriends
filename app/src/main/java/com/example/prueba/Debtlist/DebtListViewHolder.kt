package com.example.prueba.Debtlist

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba.DashBoard.DashBoardInterface
import com.example.prueba.Debt
import kotlinx.android.synthetic.main.item_desglose_movimiento.view.*

class DebtListViewHolder(v: View) : RecyclerView.ViewHolder(v) {

    fun bind(item: Debt, dashBoardInterface: DashBoardInterface) = with(itemView) {

        textViewDebtSubject.text = item.subject
        textViewDebtId.text = item.debtId.toString()
        textViewDebtValue.text = item.debt.toString()
        textViewDebtDescription.text = item.description
        textViewDebtDate.text = item.date


    }

}