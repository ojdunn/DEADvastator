package edu.gvsu.cis.deadvastation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Button;

public class TitleScreenActivity extends AppCompatActivity {
    private Button loginButton;
    private Button guestButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title_screen);

        loginButton = findViewById(R.id.loginButton);
        guestButton = findViewById(R.id.guestButton);

        // todo add facebook, google play, or other authentication method (with Firebase?)
        loginButton.setOnClickListener(v -> {
            //fromField.setText("");
        });

        guestButton.setOnClickListener(v -> {
            Intent intent = new Intent(TitleScreenActivity.this, LoadoutActivity.class);

            this.startActivity(intent);
        });
    }











}
