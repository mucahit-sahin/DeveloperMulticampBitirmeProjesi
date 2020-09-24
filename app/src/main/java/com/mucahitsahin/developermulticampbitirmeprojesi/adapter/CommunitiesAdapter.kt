package com.mucahitsahin.developermulticampbitirmeprojesi.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.mucahitsahin.developermulticampbitirmeprojesi.R
import com.mucahitsahin.developermulticampbitirmeprojesi.data.model.Community
import kotlinx.android.synthetic.main.community_recycler_row.view.*

class CommunitiesAdapter(val communityList:MutableList<Community>):RecyclerView.Adapter<CommunitiesViewHolder> (){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CommunitiesViewHolder {
        var inflate= LayoutInflater.from(parent.context).inflate(R.layout.community_recycler_row,parent)
        return CommunitiesViewHolder(inflate)
    }

    override fun onBindViewHolder(holder: CommunitiesViewHolder, position: Int) {
        val community:Community=communityList[position]
        holder.itemView.textView.text=community.name
        holder.itemView.imageView.load(community.banner)
    }

    override fun getItemCount(): Int {
        return communityList.size
    }
}

class CommunitiesViewHolder(view:View):RecyclerView.ViewHolder(view) {

}
