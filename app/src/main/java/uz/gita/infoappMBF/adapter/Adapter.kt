package uz.gita.infoappMBF.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import uz.gita.infoappMBF.ItemClickListener
import uz.gita.infoappMBF.R
import uz.gita.infoappMBF.databinding.ItemShortBinding
import uz.gita.infoappMBF.model.ItemData

class Adapter(var itemClickListener: ItemClickListener) :
    ListAdapter<ItemData, Adapter.ViewHolder>(DiffUtil()) {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding = ItemShortBinding.bind(view)
        fun bind(position: Int) {
            binding.title.text = getItem(position).title
            binding.tvDescription.text = getItem(position).description
            binding.photo.setImageResource(getItem(position).photo)
            itemView.setOnClickListener {
                itemClickListener.onItemClick(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
        return (ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_short, parent, false)
        ))
    }

    override fun onBindViewHolder(holder: Adapter.ViewHolder, position: Int) {
        val animation =
            AnimationUtils.loadAnimation(holder.itemView.context, R.anim.anim)
        holder.itemView.startAnimation(animation)
        holder.bind(position)
    }

    private class DiffUtil : androidx.recyclerview.widget.DiffUtil.ItemCallback<ItemData>() {
        override fun areItemsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
            return oldItem.title == newItem.title
        }

        override fun areContentsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
            return oldItem == newItem
        }
    }
}