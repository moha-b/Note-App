package com.example.mynote;

import static com.example.mynote.R.drawable.add;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mynote.databinding.ActivityCreateNoteBinding;
import com.example.mynote.databinding.ActivityHomeBinding;

public class CreateNote extends AppCompatActivity {

    ActivityCreateNoteBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreateNoteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        //check(title);
    }

    public void check(EditText text){

        text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(charSequence.length() != 0){
                    Toast.makeText(CreateNote.this,"okay it's worked",Toast.LENGTH_SHORT).show();
                }
            }
            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

//        if (title.getText().toString().trim().isEmpty()){
//            Toast.makeText(CreateNote.this,"Note Title Can't be Empty",Toast.LENGTH_SHORT).show();
//        }
//        else if (subTitle.getText().toString().trim().isEmpty()){
//            Toast.makeText(CreateNote.this,"Note subTitle Can't be Empty",Toast.LENGTH_SHORT).show();
//        }
//        else if (content.getText().toString().trim().isEmpty()){
//            Toast.makeText(CreateNote.this,"Note Content Can't be Empty",Toast.LENGTH_SHORT).show();
//        }
//        else {
//            done.setBackgroundColor(Color.parseColor("#54E346"));
//            title.setTextColor(Color.parseColor("#54E346"));
//        }
    }
}