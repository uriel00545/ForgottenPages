
package com.mycompany.DungeonMaster.model;

/**
 *
 * @author jaeau
 */
public abstract class Personagem {
     private String nome;
     
    private int hp;
    private int maxHp;
    
    private int speed;

    public boolean Tavivo() {
        return hp > 0;
    }

    public Personagem(String nome, int hp, int maxHp, int speed) {
        this.nome = nome;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    
}
