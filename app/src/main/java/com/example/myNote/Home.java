package com.example.mynote;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.mynote.adapters.noteAdapter;
import com.example.mynote.classes.Note;
import com.example.mynote.databinding.ActivityHomeBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

public class Home extends AppCompatActivity {

    ActivityHomeBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHomeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //FloatingActionButton fab = findViewById(R.id.fab);
        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this,CreateNote.class));
            }
        });
        Note[] note = new Note[]{
                new Note(R.drawable.car,"Welcome","Greetings","welcome to your new note application"),
                new Note(0,"New App","Explanation","This programme replaces the ark book with an improved edition."),
                new Note(R.drawable.house,"hi","",""),
                new Note(R.drawable.math,"hi","",""),
                new Note(0,"New App","Explanation","This programme replaces the ark book with an improved edition."),
                new Note(R.drawable.night,"hi","",""),
                new Note(0,"New App","Explanation","This programme replaces the ark book with an improved edition."),
                new Note(R.drawable.town,"hi","",""),
                new Note(0,"New App","Explanation","This programme replaces the ark book with an improved edition."),
                new Note(R.drawable.food,"hi","",""),
                new Note(0,"New App","Explanation","This programme replaces the ark book with an improved edition."),
        };
        //RecyclerView rv = findViewById(R.id.home_recycler);
        binding.homeRecycler.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        binding.homeRecycler.setAdapter(new noteAdapter(note));
    }
}
//        nav = findViewById(R.id.nav);
//        drawer = findViewById(R.id.drawer);
//        toolbar = findViewById(R.id.toolbar);
//        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open,R.string.close);
//        drawer.addDrawerListener(toggle);
//        toggle.syncState();
/*
*  @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        return super.onOptionsItemSelected(item);
    }

    public void showPopup(View v) {
        PopupMenu popup = new PopupMenu(this, v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.options, popup.getMenu());

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.pin:
                        Toast.makeText(Home.this,"Pinned",Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.delete:
                        Toast.makeText(Home.this,"Deleted",Toast.LENGTH_SHORT).show();
                        return true;
                    default:
                        return false;
                }
            }
        });
        popup.show();
    }
*/