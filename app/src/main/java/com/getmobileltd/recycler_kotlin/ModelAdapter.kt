package com.getmobileltd.recycler_kotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_recycler.view.*

/**
 * Created by themavencoder on 22,March,2019
 */
class ModelAdapter(val context: Context , val names : List<Model>):
        RecyclerView.Adapter<ModelAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): MyViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_recycler,viewGroup,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
      return names.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       val name = names.get(position)
       holder.bind(name, position)
    }


    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind(model : Model?, pos: Int) {
            itemView.textview_name.text = model!!.name




    }
}


}