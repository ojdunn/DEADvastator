package edu.gvsu.cis.deadvastation;

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


    }











}
