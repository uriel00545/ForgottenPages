
package com.mycompany.ForgottenPages.model;

import java.util.ArrayList;
import java.util.List;


public class Player extends Personagem {
    
    private List<Skill> skills = new ArrayList();
    

    public Player(String nome, int hp, int maxHp) {
        super(nome, hp, maxHp);
        
    }

    

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }

    

    
    
}
