package com.example.mynote.adapters;

import android.annotation.SuppressLint;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mynote.R;
import com.example.mynote.classes.Note;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.ArrayList;
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
        //holder.subtitle.setText(note.getSubTitle());
        holder.content.setText(note.getContent());
        holder.image.setImageResource(note.getImage());
        holder.like.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.like.setColorFilter(getRandomColor());
            }
        });
        int color = getRandomColor();
        //holder.drawableNoteColor.setColor(holder.itemView.getResources().getColor(color));
        holder.drawableNote.setColor(holder.itemView.getResources().getColor(color));
    }


    @Override
    public int getItemCount() {
        return Note.length;
    }

    static class NoteViewHolder extends RecyclerView.ViewHolder{
        LinearLayout linearLayout;
        GradientDrawable drawableNote;
        GradientDrawable drawableNoteColor;
        ImageView shape;
        ImageView like;
        TextView title;
        //TextView subtitle;
        TextView content;
        RoundedImageView image;
        public NoteViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.note_title);
            //subtitle = itemView.findViewById(R.id.sub_title);
            content = itemView.findViewById(R.id.note_content);
            image = itemView.findViewById(R.id.note_image);
            linearLayout = itemView.findViewById(R.id.note);
            drawableNote = (GradientDrawable) linearLayout.getBackground();
            shape = itemView.findViewById(R.id.shape);
            like = itemView.findViewById(R.id.like);
           // drawableNoteColor = (GradientDrawable) shape.getBackground();
        }
    }

    public int getRandomColor(){

        ArrayList<Integer> color = new ArrayList<>();
        color.add(R.color.color1);
        color.add(R.color.color2);
        color.add(R.color.color3);
        color.add(R.color.color4);
        color.add(R.color.color5);
        color.add(R.color.color6);
        color.add(R.color.color7);
        color.add(R.color.color8);
        color.add(R.color.color9);
        color.add(R.color.color10);
        color.add(R.color.color11);
        Random random = new Random();

        return color.get(random.nextInt(color.size()));
    }
}

/*
*   public String getRandomColor(){

        ArrayList<String> color = new ArrayList<>();
        color.add(String.valueOf(R.color.color1));
        color.add(String.valueOf(R.color.color2));
        color.add(String.valueOf(R.color.color3));
        color.add(String.valueOf(R.color.color4));
        color.add(String.valueOf(R.color.color6));
        color.add(String.valueOf(R.color.color7));
        color.add(String.valueOf(R.color.color8));
        color.add(String.valueOf(R.color.color9));
        color.add(String.valueOf(R.color.color10));
        color.add(String.valueOf(R.color.color11));
        Random random = new Random();
        return color.get(random.nextInt(12));
    }
* */
