package com.example.recyclerview

import android.graphics.Color
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private var tvItemVersionName: TextView
    private var clContainer: ConstraintLayout
    init {
        tvItemVersionName = itemView.findViewById(R.id.tvItemVersionName)
        clContainer = itemView.findViewById(R.id.clContainer)
    }

    fun configItem(nomeDaVersao: String, cor: Int){
        val posicao = adapterPosition
        tvItemVersionName.text = nomeDaVersao

       // val color = Color.parseColor(cor)

        //val bgCor:String = (cor.toString())
      //  val color = Color.parseColor(bgCor)
        clContainer.setBackgroundColor(cor)

        clContainer.setOnClickListener {

            Toast.makeText(itemView.context, "Você clicou em $nomeDaVersao na posição $posicao", Toast.LENGTH_SHORT).show()

        }
    }
}