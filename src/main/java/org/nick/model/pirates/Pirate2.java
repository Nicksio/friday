package org.nick.model.pirates;

import org.nick.model.DangerCard;

public class Pirate2 extends DangerCard implements Pirate{
    public Pirate2(){
        this.mockName = "Pirate_2";
        this.numberOfAttacks = 7;
        this.strong = new int[]{25, 25, 25};
    }
}
