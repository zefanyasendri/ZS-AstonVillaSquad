package com.dicoding.picodiploma.zs_astonvillasquad

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListPlayerAdapter(private val listPlayer: ArrayList<Player>) : RecyclerView.Adapter<ListPlayerAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater
            .from(viewGroup.context)
            .inflate(R.layout.item_row_player, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
//        val player = listPlayer[position]
//        Glide.with(holder.itemView.context)
//            .load(player.photo)
//            .apply(RequestOptions().override(55, 55))
//            .into(holder.imgPhoto)
//        holder.tvName.text = player.name
//        holder.tvDetail.text = player.detail

        // batas
        val (name, detail, photo, position, number) = listPlayer[position]

        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions())
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvDetail.text = detail

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, DetailPlayerActivity::class.java)
            moveDetail.putExtra(DetailPlayerActivity.EXTRA_NUMBER, number)
            moveDetail.putExtra(DetailPlayerActivity.EXTRA_NAME, name)
            moveDetail.putExtra(DetailPlayerActivity.EXTRA_PHOTO, photo)
            moveDetail.putExtra(DetailPlayerActivity.EXTRA_DETAIL, detail)
            moveDetail.putExtra(DetailPlayerActivity.EXTRA_POSITION, position)
            mContext.startActivity(moveDetail)
        }
    }

    override fun getItemCount(): Int {
        return listPlayer.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_player_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_player_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_player_photo)
    }
}