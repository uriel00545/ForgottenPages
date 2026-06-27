package com.mycompany.DungeonMaster.model;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Inimigo {
    
     private List<Skill> skills = new ArrayList();

    public Boss(EnemyAi ai, String nome, int hp, int maxHp, int speed) {
        super(ai, nome, hp, maxHp, speed);
    }

    @Override
    public String toString() {
        return "Boss{" + '}';
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    
}
