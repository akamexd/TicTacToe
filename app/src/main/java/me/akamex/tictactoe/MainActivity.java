package me.akamex.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.about_game).setOnClickListener(view -> startActivity(new Intent(this, AboutGame.class)));
        findViewById(R.id.startGame).setOnClickListener(view -> startActivity(new Intent(this, SelectGame.class)));
    }
}