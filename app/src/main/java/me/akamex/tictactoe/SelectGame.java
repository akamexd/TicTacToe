package me.akamex.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SelectGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_game);

        findViewById(R.id.back_to_main).setOnClickListener(view -> startActivity(new Intent(this, MainActivity.class)));
    }
}