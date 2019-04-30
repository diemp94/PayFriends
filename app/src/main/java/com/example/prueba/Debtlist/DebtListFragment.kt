package com.example.prueba.Debtlist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prueba.Debt
import com.example.prueba.R
import kotlinx.android.synthetic.main.fragment_debt_list.*
import java.util.*
import kotlin.collections.ArrayList

class DebtListFragment : Fragment() {

    private val debts: ArrayList<Debt>? = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_debt_list, container, false)

        debts?.add(Debt(15f, 1, Date(), "Comida", "coca cola del viernes de halo"))
        debts?.add(Debt(16f, 2, Date(), "Cali", "Croquetas de cali"))
        debts?.add(Debt(17f, 3, Date(), "Walmart", "comida de la carnita asada"))
        debts?.add(Debt(18f, 4, Date(), "Uber", "pedimos uber para ir al periban"))
        debts?.add(Debt(19f, 5, Date(), "Desayuno", "chilaquiles y cigarro de la mañana"))

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView_debts.layoutManager = LinearLayoutManager(context)
        recyclerView_debts.adapter = DebtListAdapter(debts)
    }

}


