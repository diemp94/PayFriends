package com.example.prueba.DashBoard

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.prueba.Debt
import com.example.prueba.Debtlist.DebtListFragment
import com.example.prueba.Movement
import com.example.prueba.R
import kotlinx.android.synthetic.main.activity_dash_board.*
import java.util.*

class DashBoardActivity : AppCompatActivity(), DashBoardInterface {

    var moves: ArrayList<Movement>? = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dash_board)


        moves?.add(Movement("Usurpadora Jurado", 300f,1))
        moves?.add(Movement("Diego Emiliano", 300f,2))
        moves?.add(Movement("Carlos Cruz", 300f,3))
        moves?.add(Movement("Melquiades Mora", 3090f,4))
        moves?.add(Movement("Jose Miguel", 300f,5))
        moves?.add(Movement("Omar de los Santos", 39900f,6))
        moves?.add(Movement("Robert Baratheon", 3000f,7))

        launchDashBoardFragment()
        supportFragmentManager.backStackEntryCount



    }

    fun launchDashBoardFragment(){
        val fragment = DashBoardFragment.getInstance(moves!!,this)
        supportFragmentManager.beginTransaction()
                .addToBackStack(fragment.javaClass.simpleName)
                .replace(R.id.debtListFragment, fragment)
                .commit()
    }

    override fun launchDebListFragment(movimiento: Movement) {
        debtListFragment.visibility = View.VISIBLE
        val fragment = DebtListFragment()
        supportFragmentManager.beginTransaction()
                .replace(R.id.debtListFragment, fragment)
                .addToBackStack(fragment.javaClass.simpleName)
                .commit()
    }

    override fun onBackPressed() {
        if(supportFragmentManager.backStackEntryCount==1){
            finish()
        }else{
            supportFragmentManager?.popBackStack()
        }
    }

}
