package com.example.pokemon;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView=(TextView) findViewById(R.id.item_name);
        imageView=(ImageView) findViewById(R.id.grid_image);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("Pokemonname"));
        imageView.setImageResource(intent.getIntExtra("pokemonimg",0));
    }
}
