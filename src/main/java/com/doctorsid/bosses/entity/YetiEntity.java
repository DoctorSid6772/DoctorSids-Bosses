package com.doctorsid.bosses.entity;

public class YetiEntity {
    private int health;
    
    public YetiEntity() {
        this.health = 1000;
    }

    public void groundSlam() {
        // Implement ground slam attack logic here
    }

    public void iceProjectileAttack() {
        // Implement ice projectile ranged attack logic here
    }

    public void summonIceMinions() {
        // Implement ice minions summoning ability here
    }

    public void freezePlayer() {
        // Implement freezing player logic here
    }

    public int getHealth() {
        return health;
    }
}