package com.example.mynote;

import static com.example.mynote.R.drawable.add;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CreateNote extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_note);

        EditText title = findViewById(R.id.create_note_title);
        EditText subTitle = findViewById(R.id.create_sub_title);
        EditText content = findViewById(R.id.create_content);
        ImageView back = findViewById(R.id.back_btn);




        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        check();
    }

    public void check(){
        EditText title = findViewById(R.id.create_note_title);
        EditText subTitle = findViewById(R.id.create_sub_title);
        EditText content = findViewById(R.id.create_content);
        ImageView done = findViewById(R.id.done);


        if (title.getText().toString().trim().isEmpty()){
            Toast.makeText(CreateNote.this,"Note Title Can't be Empty",Toast.LENGTH_SHORT).show();
        }
        else if (subTitle.getText().toString().trim().isEmpty()){
            Toast.makeText(CreateNote.this,"Note subTitle Can't be Empty",Toast.LENGTH_SHORT).show();
        }
        else if (content.getText().toString().trim().isEmpty()){
            Toast.makeText(CreateNote.this,"Note Content Can't be Empty",Toast.LENGTH_SHORT).show();
        }
        else {
            done.setBackgroundColor(Color.parseColor("#54E346"));
            title.setTextColor(Color.parseColor("#54E346"));
        }
    }
}