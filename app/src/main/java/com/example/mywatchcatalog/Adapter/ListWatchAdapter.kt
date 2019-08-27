package com.example.mywatchcatalog.Adapter

import android.view.*
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.mywatchcatalog.Catalog
import com.example.mywatchcatalog.R
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.zip.Inflater

class ListWatchAdapter(private val listWatch: ArrayList<Catalog>):
    RecyclerView.Adapter<ListWatchAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.layout_watch_catalog, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listWatch.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name,price,desc,image) = listWatch[position]

        Glide.with(holder.itemView.context)
            .load(image).apply(RequestOptions()
                .override(55,55))
            .into(holder.watchImg)

        holder.watchName.text = name
        holder.watchPrice.text = "Rp. $price"

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listWatch[holder.adapterPosition]) }
    }

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Catalog)
    }

    class ListViewHolder(item: View): RecyclerView.ViewHolder(item) {
        var watchName: TextView = item.findViewById(R.id.watch_item_name)
        var watchPrice: TextView = item.findViewById(R.id.watch_item_price)
        var watchImg: ImageView = item.findViewById(R.id.watch_item_photo)
    }

}
