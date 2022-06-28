package com.example.mynote;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.mynote.adapters.noteAdapter;
import com.example.mynote.classes.Note;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this,CreateNote.class));
            }
        });
        Note[] note = new Note[]{
                new Note(R.drawable.car,"Welcome","Greetings","welcome to your new note application"),
                new Note(R.drawable.food,"New App","Explanation","This programme replaces the ark book with an improved edition."),
                new Note(R.drawable.house,"hi","",""),
                new Note(R.drawable.math,"hi","",""),
                new Note(R.drawable.night,"hi","",""),
                new Note(R.drawable.town,"hi","",""),
                new Note(R.drawable.food,"hi","","")
        };
        RecyclerView rv = findViewById(R.id.home_recycler);
        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        rv.setAdapter(new noteAdapter(note));
    }
}