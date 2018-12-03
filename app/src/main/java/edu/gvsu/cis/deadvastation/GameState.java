package edu.gvsu.cis.deadvastation;

public class GameState {
    // todo share variables with game to control state
    // App user data:
    public String userName = "Bad Dude";
    public Boolean isLoggedIn = false;

    // Game character data:
    public enum loadout {EASY, NORMAL, HARD};
    public LoadoutActivity.loadout weapon;
    public int ammoCount = 0;
    public int currentScore = 0;
    public int health = 100;  // start at 100

    // todo methods to handle game actions?

}
