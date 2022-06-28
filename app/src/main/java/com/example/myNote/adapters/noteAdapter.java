package com.example.mynote.adapters;

import android.annotation.SuppressLint;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynote.R;
import com.example.mynote.classes.Note;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class noteAdapter extends RecyclerView.Adapter<noteAdapter.NoteViewHolder> {

    private Note[] Note;


    public noteAdapter(Note[] notes) {
        this.Note = notes;
    }

    @NonNull
    @Override
    public NoteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NoteViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.note_design,parent,false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull NoteViewHolder holder, int position) {
        com.example.mynote.classes.Note note = Note[position];
        holder.title.setText(note.getTitle());
        holder.subtitle.setText(note.getSubTitle());
        holder.content.setText(note.getContent());
        holder.image.setImageResource(note.getImage());


        holder.drawable.setColor(getRandomColor());

    }


    @Override
    public int getItemCount() {
        return Note.length;
    }

    static class NoteViewHolder extends RecyclerView.ViewHolder{
        LinearLayout linearLayout;
        GradientDrawable drawable;
        TextView title;
        TextView subtitle;
        TextView content;
        RoundedImageView image;
        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.note_title);
            subtitle = itemView.findViewById(R.id.sub_title);
            content = itemView.findViewById(R.id.note_content);
            image = itemView.findViewById(R.id.note_image);
            linearLayout = itemView.findViewById(R.id.note);
            drawable = (GradientDrawable) linearLayout.getBackground();
        }
    }

    public int getRandomColor(){

        List<Integer> color = new ArrayList<>();
        color.add(R.color.color1);
        color.add(R.color.color2);
        color.add(R.color.color3);
        color.add(R.color.color4);

        color.add(R.color.color6);
        color.add(R.color.color7);
        color.add(R.color.color8);
        color.add(R.color.color9);
        color.add(R.color.color10);
        color.add(R.color.color11);
        Random random = new Random();
        int rand = color.get(random.nextInt(color.size()));
        return rand;
    }
}

