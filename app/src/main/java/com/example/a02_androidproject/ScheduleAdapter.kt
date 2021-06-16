package com.example.a02_androidproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class ScheduleAdapter(private val schedules : MutableList<Schedule>) : RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder>()
{
    class ScheduleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
        return ScheduleViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false))
    }

    fun addSchedule(schedule: Schedule)
    {
        schedules.add(schedule)
        notifyItemInserted(schedules.size-1)
    }

    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        val curSchedule = schedules[position]
        holder.itemView.tvScheduleInformation.text = curSchedule.schedule
    }

    override fun getItemCount(): Int {
        return schedules.size
    }
}