package org.nick.model.attackcards;

import org.nick.model.AttackCard;

public class Concentrated extends AttackCard {
    //3 pcs
    public Concentrated() {
        this.mockName = "1 Сосредоточенный |";

        this.attack = 1;
        this.livesForRemove = 1;
        this.bonus = false;
    }
}
