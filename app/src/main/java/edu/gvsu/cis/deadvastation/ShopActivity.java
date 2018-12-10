package edu.gvsu.cis.deadvastation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import edu.gvsu.cis.deadvastation.dummy.ShopContent;

public class ShopActivity extends AppCompatActivity
        implements ItemsFragment.OnListFragmentInteractionListener {

    private TextView shopTitle;
    private TextView shopPoints;
    private TextView shopMessage;

    public Integer points = 0;

    // todo called everytime you come back? get points value somewhere else as well if not
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        shopTitle = findViewById(R.id.shopTitle);
        shopPoints = findViewById(R.id.shopPoints);
        shopMessage = findViewById(R.id.shopMessage);

        // Get the Intent that started this activity and extract the score
        Intent intent = getIntent();
        points = intent.getIntExtra("score", 0);
        shopPoints.setText("Score: " + points);
    }

    @Override
    /**
     * Save the users choice if they have enough points. Otherwise, display a message that they
     * don't have enough.
     */
    public void onListFragmentInteraction(ShopContent.ShopItem item) {
        System.out.println("Interact!");
        if (item.itemPrice <= points) {
            Intent intent = new Intent();
            String[] vals = {item.itemNumber.toString(), item.itemName};
            intent.putExtra("item", vals);
            setResult(LoadoutActivity.SHOP_RESULT, intent);
            finish();
        } else {
            shopMessage.setText("Not enough points dude!");
        }
    }

}
