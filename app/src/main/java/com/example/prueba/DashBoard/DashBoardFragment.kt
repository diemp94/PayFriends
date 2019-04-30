package com.example.prueba.DashBoard


import android.graphics.Interpolator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prueba.Movement
import com.example.prueba.R
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.fragment_dash_board.*


class DashBoardFragment : Fragment() {

    companion object {
        val moves: ArrayList<Movement>? = ArrayList()
        lateinit var dashBoardInterface : DashBoardInterface

        fun getInstance(moves:ArrayList<Movement>, dashBoardInterface: DashBoardInterface):DashBoardFragment{
            DashBoardFragment.moves?.clear()
            DashBoardFragment.moves?.addAll(moves)
            this.dashBoardInterface = dashBoardInterface
            return DashBoardFragment()
        }
    }
    private var click: Boolean = false
    var fabDashBoard: FloatingActionButton? = null


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_dash_board, container, false)
        fabDashBoard= view.findViewById(R.id.fabDashBoard)

        fabDashBoard?.setOnClickListener {
            click = !click
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
                val interpolador = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_slow_in)

                if(click) it.animate().rotation(135f).setInterpolator(interpolador).start()
                else it.animate().rotation(0f).setInterpolator(interpolador).start()
            }
        }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recyclerView_movimientos.layoutManager = LinearLayoutManager(context)
        recyclerView_movimientos.adapter = DashBoardDedudorAdapter(moves, context!!, dashBoardInterface)
    }


}
