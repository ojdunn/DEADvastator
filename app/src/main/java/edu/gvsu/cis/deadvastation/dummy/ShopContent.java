package edu.gvsu.cis.deadvastation.dummy;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.List;

import edu.gvsu.cis.deadvastation.LoadoutActivity;

public class ShopContent {
    public static final List<ShopItem> ITEMS = new ArrayList<ShopItem>();

    static {
        addItem(new ShopItem(0, "Pistol", 0));
        addItem(new ShopItem(1, "Automatic Rifle", 10));
        addItem(new ShopItem(2, "Sniper Rifle", 100));
    }

    public static void addItem(ShopItem item) {
        ITEMS.add(item);
    }

    // INNER CLASS
    public static class ShopItem {
        public final Integer itemNumber;
        public final String itemName;
        public final Integer itemPrice;
        //public final LoadoutActivity.loadout loadout;

        public ShopItem(Integer itemNumber, String itemName, Integer itemPrice) {
            this.itemNumber = itemNumber;
            this.itemName = itemName;
            this.itemPrice = itemPrice;
        }

        @Override
        public String toString() {
            return this.itemName + " Price: " + this.itemPrice;
        }
    }
}
