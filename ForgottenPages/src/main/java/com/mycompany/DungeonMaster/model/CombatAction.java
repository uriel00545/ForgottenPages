/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.DungeonMaster.model;

/**
 *
 * @author jaeau
 */
public class CombatAction {
     private Personagem usuario;
    private Personagem alvo;
    private Skill skill;

    public CombatAction(Personagem usuario, Personagem alvo, Skill skill) {
        this.usuario = usuario;
        this.alvo = alvo;
        this.skill = skill;
    }

    public Personagem getUsuario() {
        return usuario;
    }

    public void setUsuario(Personagem usuario) {
        this.usuario = usuario;
    }

    public Personagem getAlvo() {
        return alvo;
    }

    public void setAlvo(Personagem alvo) {
        this.alvo = alvo;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

   
}
