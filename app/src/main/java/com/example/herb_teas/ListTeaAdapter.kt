package com.example.herb_teas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListTeaAdapter(private val listTea: ArrayList<Teas>): RecyclerView.Adapter<ListTeaAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback){
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val itemView: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row_tea, viewGroup, false)
        return ListViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val tea = listTea[position]

        Glide.with(holder.itemView.context)
            .load(tea.img)
            .apply(RequestOptions().override(55, 55))
            .into(holder.image)

        holder.tvName.text = tea.name
        holder.tvDetail.text = tea.detail

        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listTea[holder.bindingAdapterPosition])
        }
    }

    override fun getItemCount() = listTea.size

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_tea_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_tea_detail)
        var image: ImageView = itemView.findViewById(R.id.img_tea_photo)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Teas)
    }

}

