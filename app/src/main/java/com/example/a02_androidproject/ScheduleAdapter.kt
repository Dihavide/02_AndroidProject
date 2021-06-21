package com.example.a02_androidproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*


class ScheduleAdapter(private val schedules : MutableList<Schedule>) : RecyclerView.Adapter<ScheduleAdapter.ScheduleViewHolder>()
{
    class ScheduleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)



    /**
     *Accessors
     **/

    /**
     *Gets the amount of elements that are currently in the recyclerview
     * @return schedules.size The amount of elements inside the array
     **/
    override fun getItemCount(): Int {
        return schedules.size
    }

    /**
     *Mutators
     **/

    /**
     *Creates a method of converting an xml layout file to a file that kotlin can read
     * @param parent The class that contains the view
     * @param viewType The type of view that is being created
     * @return ScheduleViewHolder(schedView) The look of the recyclerview list with the corresponding layout
     **/
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleViewHolder {
        val schedView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ScheduleViewHolder(schedView)
    }

    /**
     *Adds a component to the recyclerview list
     * @param schedule The information that the user wants to add to the schedule
     **/
    fun addSchedule(schedule: Schedule)
    {
        schedules.add(schedule)
        notifyItemInserted(schedules.size-1)
    }

    /**
     *Binds information to the item view that makes up the recyclerview
     * @param holder The part of the recyclerview that you want to bind the information to
     * @param position The location of the array of items that you want to bind it to
     **/
    override fun onBindViewHolder(holder: ScheduleViewHolder, position: Int) {
        val curSchedule = schedules[position]
        holder.itemView.tvScheduleInformation.text = curSchedule.givenSchedule
        holder.itemView.tvFromTime.text = curSchedule.givenTimeFrom
        holder.itemView.tvToTime.text = curSchedule.givenTimeTo
    }
}