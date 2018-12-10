package edu.gvsu.cis.deadvastation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import edu.gvsu.cis.deadvastation.dummy.ShopContent;

import static java.lang.Integer.valueOf;

public class LoadoutActivity extends AppCompatActivity {
    // Options dropdown selections
    public static int GAME_RESULT = 1;
    public static int OPTIONS_RESULT = 2;
    public static int SHOP_RESULT = 3;
    public static int HIGH_SCORES_RESULT = 4;

    // Loadout views
//    private ImageButton easyButton;
//    private ImageButton normalButton;
//    private ImageButton hardButton;
    private TextView currentHighScore;
    private Button playButton;
    private Button highScoresButton;
    private ImageView gearChoice;

    // Game state variables (may want in own class)
    // todo share variables with game to control state
    public Integer itemNumber = 0;
    public String itemName = "Pistol";
    public enum loadout {PISTOL, RIFLE, SNIPER};
    public loadout loadout;
//    public int ammoCount = 0;  // account for this?
    public int currentScore = 0;
    public int health = 100;  // start at 100


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadout);

        // Wire up the views from the layout.
//        easyButton = findViewById(R.id.easyButton);
//        normalButton = findViewById(R.id.normalButton);
//        hardButton = findViewById(R.id.hardButton);
        currentHighScore = findViewById(R.id.loadoutHighScoreView);
        playButton = findViewById(R.id.playButton);
        highScoresButton = findViewById(R.id.highScoresButton);
        gearChoice = findViewById(R.id.gearImage);

        //todo if user logged in, get the high score from the db


        // Add listeners for buttons.
        //todo save user choice in a variable to use with game item (done through shop instead)
//        easyButton.setOnClickListener(v -> {
//            weapon = loadout.EASY;
//            //fromField.setText("");
//        });
//        normalButton.setOnClickListener(v -> {
//            weapon = loadout.NORMAL;
//            //fromField.setText("");
//        });
//        hardButton.setOnClickListener(v -> {
//            weapon = loadout.HARD;
//            //fromField.setText("");
//        });

        playButton.setOnClickListener(v -> {
            // todo transition to game activity
            
        });

//        shopButton.setOnClickListener(v -> {
//            // todo transition to high scores activity
//
//        });

        highScoresButton.setOnClickListener(v -> {
            // todo transition to high scores activity

        });

        // todo add save button
//        saveButton.setOnClickListener(v -> {
//            // todo transition to high scores activity
//
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.loadout_menu, menu);
        return true;  // make visible
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.action_game) {
            Intent intent = new Intent(LoadoutActivity.this, GameActivity.class);
            intent.putExtra("score", currentScore);
            intent.putExtra("health", health);
//            intent.putExtra("ammo", ammoCount);
            startActivityForResult(intent, GAME_RESULT);
            return true;
        } else if(item.getItemId() == R.id.action_options) {
            Intent intent = new Intent(LoadoutActivity.this, OptionsActivity.class);

            startActivityForResult(intent, OPTIONS_RESULT);
            return true;
        } else if(item.getItemId() == R.id.action_shop) {
            Intent intent = new Intent(LoadoutActivity.this, ShopActivity.class);
            intent.putExtra("score", currentScore);
            startActivityForResult(intent, SHOP_RESULT);
            return true;
        } else if(item.getItemId() == R.id.action_high_scores) {
            Intent intent = new Intent(LoadoutActivity.this, HighScoresActivity.class);

            startActivityForResult(intent, HIGH_SCORES_RESULT);
            return true;
        }


        return false;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == GAME_RESULT) {
            // todo update data from the game

        } else if (resultCode == OPTIONS_RESULT) {
            // todo adjust the volume based on user choice

        } else if (resultCode == SHOP_RESULT) {
            // todo update chosen item from shop
            String[] vals = data.getStringArrayExtra("item");
            this.itemNumber = Integer.parseInt(vals[0]);
            // update the image based on the chosen loadout
            int id;
            switch (this.itemNumber) {
                case 0:
                    id = getResources().getIdentifier("ic_handgun", "drawable", getPackageName());
                    this.gearChoice.setImageResource(id);
                    break;
                case 1:
                    id = getResources().getIdentifier("ic_automatic_weapon", "drawable", getPackageName());
                    this.gearChoice.setImageResource(id);
                    break;
                case 2:
                    id = getResources().getIdentifier("ic_sniper_rifle", "drawable", getPackageName());
                    this.gearChoice.setImageResource(id);
                    break;
            }

            this.itemName = vals[1];

//            this.fromField.setText(vals[0]);
//            this.toField.setText(vals[1]);
//            this.mode = Mode.valueOf(vals[2]);
//            this.fromUnits.setText(vals[3]);
//            this.toUnits.setText(vals[4]);
//            this.title.setText(mode.toString() + " Converter");

        } else if (resultCode == HIGH_SCORES_RESULT) {
            // todo update text of high score


        }

//        if (resultCode == SETTINGS_RESULT) {
//            this.fromUnits.setText(data.getStringExtra("fromUnits"));
//            this.toUnits.setText(data.getStringExtra("toUnits"));
//        } else if (resultCode == HISTORY_RESULT) {
//            String[] vals = data.getStringArrayExtra("item");
//            this.fromField.setText(vals[0]);
//            this.toField.setText(vals[1]);
//            this.mode = Mode.valueOf(vals[2]);
//            this.fromUnits.setText(vals[3]);
//            this.toUnits.setText(vals[4]);
//            this.title.setText(mode.toString() + " Converter");
//        }

    }



}
