package edu.gvsu.cis.deadvastation;

public class GameState {
    // todo share variables with game to control state
    // App user data:
    public String userName;
    public Boolean isLoggedIn;

    // Game character data:
    public Integer itemNumber;
    public String itemName;
    public enum loadout {EASY, NORMAL, HARD};
    public LoadoutActivity.loadout weapon;
//    public int ammoCount;
    public Integer currentScore;
    public Integer health;  // start at 100
    public Integer saveNumber;
    public String _key;

    public GameState() {
        this.userName = "Bad Dude";
        //this.isLoggedIn = false;
        this.itemNumber = 0;
        this.itemName = "Pistol";
        this.currentScore = 0;
        this.health = 100;
        this.saveNumber = 0;
    }

    public GameState(String userName, String itemName, Integer itemNumber, Integer currentScore,
                     Integer health, Integer saveNumber) {
        this.userName = userName;
        //this.isLoggedIn = isLoggedIn;
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.currentScore = currentScore;
        this.health = health;
        this.saveNumber = saveNumber;
    }

    // todo methods to handle game actions?

}
