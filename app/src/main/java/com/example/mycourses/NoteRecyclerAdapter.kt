package com.example.mycourses

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mynotekeeper.NoteInfo

class NoteRecyclerAdapter (private val context: Context, private val notes: List<NoteInfo>):
    RecyclerView.Adapter<NoteRecyclerAdapter.ViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = layoutInflater.inflate(R.layout.item_note_list,parent,false)
        return ViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val note = notes[position]
        holder.textCourse?.text = note.course?.title
        holder.textTitle?.text = note.title
        holder.notePosition = position

    }

    override fun getItemCount(): Int =  notes.size

   inner class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!){
       val textCourse = itemView?.findViewById<TextView?>(R.id.textCoure)
        val textTitle = itemView?.findViewById<TextView?>(R.id.textTitle)
        var notePosition = 0
        init{
            itemView?.setOnClickListener{
                val intent = Intent(context,NoteActivity::class.java)
                intent.putExtra(NOTE_POSITION,notePosition)
                context.startActivity(intent)
            }
        }
    }


}