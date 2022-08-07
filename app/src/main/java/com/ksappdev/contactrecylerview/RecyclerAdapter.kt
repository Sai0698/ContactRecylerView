package com.ksappdev.contactrecylerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contact_list.view.*

class RecyclerAdapter(val context:Context,val data:ArrayList<ContactModel>): RecyclerView.Adapter<RecyclerAdapter.Myviewholder>() {

    class Myviewholder(view:View):RecyclerView.ViewHolder(view){
        val imgContact=view.contactImg
        val nameContact=view.contactName
        val numbercontact=view.contactNumber
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Myviewholder {
        val view2 = LayoutInflater.from(context).inflate(R.layout.contact_list,parent, false)
        return Myviewholder(view2)
    }

    override fun onBindViewHolder(holder: Myviewholder, position: Int) {
        holder.imgContact.setImageResource(data[position].img)
        holder.nameContact.text =data[position].name
        holder.numbercontact.text=data[position].number
    }

    override fun getItemCount(): Int {
        return data.size
    }
}