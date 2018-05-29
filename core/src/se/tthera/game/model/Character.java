package se.tthera.game.model;

public abstract class Character {

    protected int baseDamage;
    protected int maxHealth;
    protected int health;
    protected Facing facing;
    protected Position position;

    public Character(int baseDamage, int maxHealth, int health, Facing facing, Position position) {
        this.baseDamage = baseDamage;
        this.maxHealth = maxHealth;
        this.health = health;
        this.facing = facing;
        this.position = position;
    }

    public int getHealth() {
        return health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }



}
