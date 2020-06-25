package com.example.mobiledevprojectcasper.Database

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.example.mobiledevprojectcasper.R
import kotlinx.android.synthetic.main.item_ability.view.*

public class BuildAdapter(private val build: List<Build>) : RecyclerView.Adapter<BuildAdapter.ViewHolder>(){
    override fun getItemCount(): Int{
        return build.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(build[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_ability, parent, false)
        )
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(build: Build){
            itemView.ibAbilityButton.setImageResource(build.abilityCharacter!!)
        }
    }
}

