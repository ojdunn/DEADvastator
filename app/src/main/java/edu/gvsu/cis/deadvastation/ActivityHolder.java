package edu.gvsu.cis.deadvastation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

import com.bon317.MadZombie.UnityPlayerActivity;

public class ActivityHolder extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holder);
        Intent intent = new Intent(ActivityHolder.this, UnityPlayerActivity.class);
        startActivity(intent);
    }
}
