package com.example.mobiledevprojectcasper.Database

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mobiledevprojectcasper.ui.abilityselection.AbilitySelectionActivity
import com.example.mobiledevprojectcasper.R
import kotlinx.android.synthetic.main.item_ability.view.*


private var counter = 0



class AbilityAdapter(private val ability: List<Ability>) : RecyclerView.Adapter<AbilityAdapter.ViewHolder>(){
    private lateinit var parentView: ViewGroup
    private lateinit var context: Context
    override fun getItemCount(): Int{
        return ability.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(ability[position])


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        parentView = parent
        context = parent.context
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_ability, parent, false)

        )

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(ability: Ability){
            var test = context as AbilitySelectionActivity
//            var itemParent = itemView.parent as ViewGroup
            itemView.ibAbilityButton.setImageResource(ability.ability_image)
            itemView.ibAbilityButton.setOnClickListener {

                    if (counter == 0) {
                        test.findViewById<ImageButton>(R.id.ibAbility0)
                            .setImageResource(Build.ABILITY_RAIGON_LOGO[adapterPosition])
                        test.findViewById<TextView>(R.id.tvAbility0).text =
                            Build.ABILITY_RAIGON_NAME[adapterPosition]
                        counter++
                    } else if (counter == 1) {
                        test.findViewById<ImageButton>(R.id.ibAbility1)
                            .setImageResource(Build.ABILITY_RAIGON_LOGO[adapterPosition])
                        counter++
                    } else if (counter == 2) {
                        test.findViewById<ImageButton>(R.id.ibAbility2)
                            .setImageResource(Build.ABILITY_RAIGON_LOGO[adapterPosition])
                        counter++
                    } else if (counter == 3) {
                        test.findViewById<ImageButton>(R.id.ibAbility3)
                            .setImageResource(Build.ABILITY_RAIGON_LOGO[adapterPosition])
                        counter++
                    } else if (counter == 4) {
                        test.findViewById<ImageButton>(R.id.ibAbility4)
                            .setImageResource(Build.ABILITY_RAIGON_LOGO[adapterPosition])
                        counter = 0
                    }

            }
        }

    }
}