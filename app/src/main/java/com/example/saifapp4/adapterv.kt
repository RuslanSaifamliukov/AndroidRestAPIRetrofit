package com.example.saifapp4

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.saifapp4.data
import com.example.saifapp4.data_movie


class adapterv (val con2: Context, val data: List<data_movie>): RecyclerView.Adapter<adapterv.link2>(){
    class link2 (vi: View): RecyclerView.ViewHolder(vi){
        val im_dii: ImageView = vi.findViewById(R.id.imageView3)
        val ti_dii: TextView = vi.findViewById(R.id.textView4)
    }



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): adapterv.link2 {
        val rri = LayoutInflater.from(con2).inflate(R.layout.button, parent, false)
        return link2(rri)
    }

    override fun onBindViewHolder(holder: adapterv.link2, position: Int) {
        Glide.with(con2).load(data[position].image).into(holder.im_dii)
        holder.ti_dii.setText(data[position].title)
    }

    override fun getItemCount(): Int {
        return data.size
    }

}