package org.nick.model.pirates;

import org.nick.model.DangerCard;

public class Pirate1 extends DangerCard implements Pirate{
    public Pirate1(){
        this.mockName = "Pirate_1";
        this.numberOfAttacks = 6;
        this.strong = new int[]{20, 20, 20};
    }
}
