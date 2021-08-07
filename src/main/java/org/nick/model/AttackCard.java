package org.nick.model;

public abstract class AttackCard extends Card {
    protected int attack;
    protected int livesForRemove;
    protected boolean bonus;

    public void useBonus(){}

    public void addEffect(){}

    public void applyAftermath(){}
}
