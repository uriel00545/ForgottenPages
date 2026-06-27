package com.mycompany.DungeonMaster.model;

import java.util.ArrayList;
import java.util.List;


public class Player extends Personagem {
    
    private List<Skill> skills = new ArrayList();

    public Player(String nome, int hp, int maxHp, int speed) {
        super(nome, hp, maxHp, speed);
    }
    

    

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

 
    
}
