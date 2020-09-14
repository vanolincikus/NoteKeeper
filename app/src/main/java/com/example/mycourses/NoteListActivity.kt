package com.example.mycourses

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mynotekeeper.DataManager
import com.example.mynotekeeper.NoteInfo

import kotlinx.android.synthetic.main.content_note_list.*

class NoteListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_list)
        setSupportActionBar(findViewById(R.id.toolbar))
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            val activityIntent = Intent(this, NoteActivity::class.java)
            startActivity(activityIntent)
        }
        listItems.layoutManager = LinearLayoutManager(this)
        listItems.adapter = NoteRecyclerAdapter(this, DataManager.notes)

    }

    override fun onResumeFragments() {
        super.onResumeFragments()
        listItems.adapter?.notifyDataSetChanged()
    }

}